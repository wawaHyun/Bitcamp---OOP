package serviceImpl;

import builder.MemberBuilder;
import controller.UserController;
import model.MemberDto;
import service.KaupService;
import service.UserService;
import service.UtilService;

import java.sql.SQLOutput;
import java.util.*;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();
    Map<String, MemberDto> users;
    private UserServiceImpl() {
    }

    public static UserService getInstance() {
        return instance;
    }


    //-----------------------------------singleton
    @Override
    public String addUsers() {
        Map<String, MemberDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String memberId = UtilServiceImpl.getInstance().createRandomMemberId();
            map.put(memberId, new MemberBuilder()
                    .memberId(memberId)
                    .memberPw("1111")
                    .name(util.createRandomName())
                    .job(util.createRandomName())
                    .build());
        }

        users = map;
        return "더미값 추가";
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("아래 항목을 순서대로 입력하여 주세요.");
        System.out.println("ID, PW, 이름, 주민번호, 폰번호, 주소, 직업, 키, 몸무게");
        System.out.println("jaja 998 jainname 00531 010555 adressUU OLdesu 180 70");

        String keyId = sc.next();

        users.put(keyId, new MemberBuilder()
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

        return "회원가입";
    }

    @Override
    public String login(MemberDto memberParam) {
        String result = "";
        MemberDto userIdMap = users.get(memberParam.getMemberId());

        if(userIdMap==null){
            result = "로그인실패 : 아이디가 검색되지 않습니다. ";
        }else{
            if (userIdMap.getMemberPw().equals(memberParam.getMemberPw())) {
                result = memberParam.getMemberId()+"님 로그인되었습니다.\n어서오세요.";
            }else{
                result="로그인 실패 : 비번이 맞지 않습니다. ";
            }
        }
        return result;
    }


    @Override
    public String findUserById(String username) {
        String result = null;

        if (users.containsKey(username)) {
            result = username+" ID가 있습니다.";
        }else {
            result = username+" ID가 검색되지 않습니다. ";
        }
        return result;
    }

    @Override
    public String updatePassword(MemberDto user) {
        String result ="";
        MemberDto userInMap = users.get(user.getMemberId());
        if(userInMap != null){
            userInMap.setMemberPw(user.getMemberPw());
            result = "비번 변경 완료!!!!!!!!!";
        }else {
            result = "없는아이디!!!!!!!다시!!";
        }
    return result;
    }

    @Override
    public String deleteUser(String username) {
        String result = "";
        if(users.containsKey(username)){
            users.remove(username);
            result = username+"의 회원탈퇴가 완료되었습니다.";
        }else{
            result = username+"는 찾을수 없는 회원입니다. ";
        }
        return result;
    }

    @Override
    public Map<String, MemberDto> getUserMap() {
        users.forEach((k, v) -> System.out.println("{{key : " + k + ", vleue : " + v + "}}"));
        return users;
    }

    @Override
    public List<MemberDto> findUsersByName(MemberDto name) {

//        List<MemberDto> list = new ArrayList<>();
//        for(String key : users.keySet()){
//            MemberDto nameMap = users.get(key);
//            if(nameMap.getName().equals(name.getName())){
//                list.add(nameMap);
//            }
//        }
//
//        return list;

        return users.values()
                .stream()
                .filter(i->i.getName().equals(name.getName()))
                .toList();
    }

    @Override
    public String findUsersByJob(MemberDto userJob) {
        String result = "";
        int round = 0;

        for(String findKey : users.keySet()){
        MemberDto findJob = users.get(findKey);
            if (findJob.getJob().equals(userJob.getJob())){
                round+=1;
            }else{}
        }

        if(round>=1) result = "직업 "+userJob.getJob()+"(이/가) "+round+"건 검색되었습니다.";
        else result = "직업 "+userJob.getJob()+"이 검색되지 않습니다";

        return result;
    }

    @Override
    public String countUsers() {
        return users.size() + "";
    }
}
