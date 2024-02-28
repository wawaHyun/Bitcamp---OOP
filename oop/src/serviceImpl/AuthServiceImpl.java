package serviceImpl;

import builder.MemberBuilder;
import model.MemberDto;
import service.AuthService;
import service.GradeService;
import service.UtilService;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, MemberDto> users;
    private AuthServiceImpl() {
        this.users = new HashMap<>();
    }
    public static AuthService getInstance() {
        return instance;
    }


    //-----------------------------------singleton


    @Override
    public String join(Scanner sc) {
        System.out.println("아래 항목을 순서대로 입력하여 주세요.");
        System.out.println("ID, PW, 이름, 주민번호, 폰번호, 주소, 직업, 키, 몸무게");
        System.out.println("jaja 998 jainname 00531 010555 adressUU OLdesu 180 70");


        Map<String, MemberDto> map = new HashMap<>();
        String keyId = sc.next();
        map.put(keyId,new MemberBuilder()
                .memberId(keyId)
                .memberPw(sc.next())
                .name(sc.next())
                .socialNum(sc.nextInt())
                .phoneNum(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .height(sc.nextInt())
                .weight(sc.nextInt())
                .build());

        users = map;
        return "";

    }

    @Override
    public String login(Scanner sc) {
        Map<String, MemberDto> map = new HashMap<>();
        String loginSc = sc.next();
        map = users;

        for(Map.Entry<String,MemberDto> entry :map.entrySet()){
            String key = entry.getKey();
            if(loginSc != key){
                System.out.println("key "+key+", loginSc "+loginSc);
                System.out.println("로그인되었습니다. ");
            }else{
                System.out.println("key "+key+", loginSc "+loginSc);
                System.out.println("로그인에 실패");
            }
        }
        return "";
    }


    @Override
    public String addUsers() {
        Map<String, MemberDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++) {
            String memberId = UtilServiceImpl.getInstance().createRandomMemberId();
            map.put(memberId+"  ", new MemberBuilder()
                    .memberId(memberId)
                    .memberPw("1111")
                    .name(util.createRandomName())
                    .build());
        }
        users = map;
        return "더미값 추가";
    }

    @Override
    public MemberDto findUser(String username) {
        MemberDto member = new MemberBuilder()
                .memberId(username)
                .build();

        //swith문 안돼~!
//        switch (username){
//            case username : "아이디 "+username+"가 있습니다."
//            case
//        }


        //람다식 ㅎㅎ 안대~1
//        users.forEach((k,v)-  >{
//            if(users.get(k)=username){
//                System.out.println("아이디 "+username+"가 있습니다.");
//            }
//        });

        //map Hash
        Map<String, MemberDto> map = new HashMap<>();
        map = users;

        //for문 응 안돼~!
//        for(int i=0;i<users.size();i++){
//            if(username==users.get(i,i)){
//                System.out.println("아이디 "+username+"가 있습니다.");
//            }}

        return member;
    }

    @Override
    public Map<String, MemberDto> getUsersMap() {
        users.forEach((k,v)-> System.out.println("{{key : "+k+", vleue : "+v+"}}"));
        System.out.println(" ");
//        System.out.println(users);
        return users;
    }

    @Override
    public String count() {
        return "회원수는 "+users.size()+"명입니다.";
    }

}

