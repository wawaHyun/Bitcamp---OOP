<<<<<<< HEAD
package serviceImpl;

import model.Member;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<?,?> users;
    List<?> uersList;
    private AuthServiceImpl() {
        this.users = new HashMap<>();
        this.uersList = new ArrayList<>();
    }
    public static AuthService getInstance() {
        return instance;
    }


    //-----------------------------------singleton


    @Override
    public String join(Scanner sc) {
        System.out.println("Please enter information below in order.");
        System.out.println("ID, PW, name, socialNum, phoneNum, address, job, height, weight");
        System.out.println("jaja 998 jainname 00531 010555 adressUU OLdesu 180 70");


        Map<String, Member> map = new HashMap<>();
        String keyId = sc.next();
        map.put(keyId,Member.builder()
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
        Map<?, ?> map = new HashMap<>();
        String loginSc = sc.next();
        map = users;

        for(Map.Entry<?,?> entry :map.entrySet()){
            String key = String.valueOf(entry.getKey());
            if(loginSc != key){
                System.out.println("key "+key+", loginSc "+loginSc);
                System.out.println("login success");
            }else{
                System.out.println("key "+key+", loginSc "+loginSc);
                System.out.println("login fail");
            }
        }
        return "";
    }


    @Override
    public String addUsers() {
        Map<String, Member> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++) {
            String memberId = UtilServiceImpl.getInstance().createRandomMemberId();
            map.put(memberId, Member.builder()
                    .memberId(memberId)
                    .memberPw("1111")
                    .name(util.createRandomName())
                    .build());
        }
        users = map;
        return "add dummy";
    }

    @Override
    public Member findUser(String username) {
        Member member = Member.builder()
                .memberId(username)
                .build();

        //swith test
//        switch (username){
//            case username : "ID "+username+"is "
//            case
//        }


        //ramda test
//        users.forEach((k,v)-  >{
//            if(users.get(k)=username){
//                System.out.println("아이디 "+username+"가 있습니다.");
//            }
//        });

        //map Hash
        Map<?, ?> map = new HashMap<>();
        map = users;

        //for test
//        for(int i=0;i<users.size();i++){
//            if(username==users.get(i,i)){
//                System.out.println("아이디 "+username+"가 있습니다.");
//            }}

        return member;
    }

    @Override
    public Map<?,?> getUsersMap() {
        users.forEach((k,v)-> System.out.println("{{key : "+k+", vleue : "+v+"}}"));
        System.out.println(" ");
//        System.out.println(users);
        return users;
    }

    @Override
    public String count() {
        return "total of Number is "+users.size();
    }

}

=======
package serviceImpl;

import model.Member;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<?,?> users;
    List<?> uersList;
    private AuthServiceImpl() {
        this.users = new HashMap<>();
        this.uersList = new ArrayList<>();
    }
    public static AuthService getInstance() {
        return instance;
    }


    //-----------------------------------singleton


    @Override
    public String join(Scanner sc) {
        System.out.println("Please enter information below in order.");
        System.out.println("ID, PW, name, socialNum, phoneNum, address, job, height, weight");
        System.out.println("jaja 998 jainname 00531 010555 adressUU OLdesu 180 70");


        Map<String, Member> map = new HashMap<>();
        String keyId = sc.next();
        map.put(keyId,Member.builder()
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
        Map<?, ?> map = new HashMap<>();
        String loginSc = sc.next();
        map = users;

        for(Map.Entry<?,?> entry :map.entrySet()){
            String key = String.valueOf(entry.getKey());
            if(loginSc != key){
                System.out.println("key "+key+", loginSc "+loginSc);
                System.out.println("login success");
            }else{
                System.out.println("key "+key+", loginSc "+loginSc);
                System.out.println("login fail");
            }
        }
        return "";
    }


    @Override
    public String addUsers() {
        Map<String, Member> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++) {
            String memberId = UtilServiceImpl.getInstance().createRandomMemberId();
            map.put(memberId, Member.builder()
                    .memberId(memberId)
                    .memberPw("1111")
                    .name(util.createRandomName())
                    .build());
        }
        users = map;
        return "add dummy";
    }

    @Override
    public Member findUser(String username) {
        Member member = Member.builder()
                .memberId(username)
                .build();

        //swith test
//        switch (username){
//            case username : "ID "+username+"is "
//            case
//        }


        //ramda test
//        users.forEach((k,v)-  >{
//            if(users.get(k)=username){
//                System.out.println("아이디 "+username+"가 있습니다.");
//            }
//        });

        //map Hash
        Map<?, ?> map = new HashMap<>();
        map = users;

        //for test
//        for(int i=0;i<users.size();i++){
//            if(username==users.get(i,i)){
//                System.out.println("아이디 "+username+"가 있습니다.");
//            }}

        return member;
    }

    @Override
    public Map<?,?> getUsersMap() {
        users.forEach((k,v)-> System.out.println("{{key : "+k+", vleue : "+v+"}}"));
        System.out.println(" ");
//        System.out.println(users);
        return users;
    }

    @Override
    public String count() {
        return "total of Number is "+users.size();
    }

}

>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
