<<<<<<< HEAD
package serviceImpl;

import model.Member;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();
    Map<String, Member> users;
    private UserServiceImpl() {
    }

    public static UserService getInstance() {
        return instance;
    }


    //-----------------------------------singleton
    @Override
    public String addUsers() {
        Map<String, Member> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String memberId = UtilServiceImpl.getInstance().createRandomMemberId();
            map.put(memberId, Member.builder()
                    .memberId(memberId)
                    .memberPw("1111")
                    .name(util.createRandomName())
                    .job(util.createRandomName())
                    .build());
        }

        users = map;
        return "add dummy";
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("Please enter information below in order.");
        System.out.println("ID, PW, name, socialNum, phoneNum, address, job, height, weight");
        System.out.println("jaja 998 jainname 00531 010555 adressUU OLdesu 180 70");

        String keyId = sc.next();

        users.put(keyId, Member.builder()
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

        return "join us";
    }

    @Override
    public String login(Member memberParam) {
        String result = "";
        Member userIdMap = users.get(memberParam.getMemberId());

        if(userIdMap==null){
            result = "404 Not Found : ID ID not found.";
        }else{
            if (userIdMap.getMemberPw().equals(memberParam.getMemberPw())) {
                result = memberParam.getMemberId()+" wellcome to back";
            }else{
                result="404 Not Found : login fail";
            }
        }
        return result;
    }


    @Override
    public String findUserById(String username) {
        String result = null;

        if (users.containsKey(username)) {
            result = "ID : "+username+" is already in use.";
        }else {
            result = username+"404 Not Found : PW";
        }
        return result;
    }

    @Override
    public String updatePassword(Member user) {
        String result ="";
        Member userInMap = users.get(user.getMemberId());
        if(userInMap != null){
            userInMap.setMemberPw(user.getMemberPw());
            result = "Password change complete";
        }else {
            result = "404 Not Found : ID";
        }
    return result;
    }

    @Override
    public String deleteUser(String username) {
        String result = "";
        if(users.containsKey(username)){
            users.remove(username);
            result = username+" : membership withdrawal has been completed.";
        }else{
            result = username+" : 404 Not Found";
        }
        return result;
    }

    @Override
    public Map<String, Member> getUserMap() {
        users.forEach((k, v) -> System.out.println("{{key : " + k + ", vleue : " + v + "}}"));
        return users;
    }

    @Override
    public List<Member> findUsersByName(Member name) {

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
    public String findUsersByJob(Member userJob) {
        String result = "";
        int round = 0;

        for(String findKey : users.keySet()){
        Member findJob = users.get(findKey);
            if (findJob.getJob().equals(userJob.getJob())){
                round+=1;
            }else{}
        }

        if(round>=1) result = "job "+userJob.getJob()+" : "+round+" result found.";
        else result = "job "+userJob.getJob()+" : result not found.";

        return result;
    }

    @Override
    public String countUsers() {
        return users.size() + "";
    }


}
=======
package serviceImpl;

import model.Member;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();
    Map<String, Member> users;
    private UserServiceImpl() {
    }

    public static UserService getInstance() {
        return instance;
    }


    //-----------------------------------singleton
    @Override
    public String addUsers() {
        Map<String, Member> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String memberId = UtilServiceImpl.getInstance().createRandomMemberId();
            map.put(memberId, Member.builder()
                    .memberId(memberId)
                    .memberPw("1111")
                    .name(util.createRandomName())
                    .job(util.createRandomName())
                    .build());
        }

        users = map;
        return "add dummy";
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("Please enter information below in order.");
        System.out.println("ID, PW, name, socialNum, phoneNum, address, job, height, weight");
        System.out.println("jaja 998 jainname 00531 010555 adressUU OLdesu 180 70");

        String keyId = sc.next();

        users.put(keyId, Member.builder()
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

        return "join us";
    }

    @Override
    public String login(Member memberParam) {
        String result = "";
        Member userIdMap = users.get(memberParam.getMemberId());

        if(userIdMap==null){
            result = "404 Not Found : ID ID not found.";
        }else{
            if (userIdMap.getMemberPw().equals(memberParam.getMemberPw())) {
                result = memberParam.getMemberId()+" wellcome to back";
            }else{
                result="404 Not Found : login fail";
            }
        }
        return result;
    }


    @Override
    public String findUserById(String username) {
        String result = null;

        if (users.containsKey(username)) {
            result = "ID : "+username+" is already in use.";
        }else {
            result = username+"404 Not Found : PW";
        }
        return result;
    }

    @Override
    public String updatePassword(Member user) {
        String result ="";
        Member userInMap = users.get(user.getMemberId());
        if(userInMap != null){
            userInMap.setMemberPw(user.getMemberPw());
            result = "Password change complete";
        }else {
            result = "404 Not Found : ID";
        }
    return result;
    }

    @Override
    public String deleteUser(String username) {
        String result = "";
        if(users.containsKey(username)){
            users.remove(username);
            result = username+" : membership withdrawal has been completed.";
        }else{
            result = username+" : 404 Not Found";
        }
        return result;
    }

    @Override
    public Map<String, Member> getUserMap() {
        users.forEach((k, v) -> System.out.println("{{key : " + k + ", vleue : " + v + "}}"));
        return users;
    }

    @Override
    public List<Member> findUsersByName(Member name) {

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
    public String findUsersByJob(Member userJob) {
        String result = "";
        int round = 0;

        for(String findKey : users.keySet()){
        Member findJob = users.get(findKey);
            if (findJob.getJob().equals(userJob.getJob())){
                round+=1;
            }else{}
        }

        if(round>=1) result = "job "+userJob.getJob()+" : "+round+" result found.";
        else result = "job "+userJob.getJob()+" : result not found.";

        return result;
    }

    @Override
    public String countUsers() {
        return users.size() + "";
    }


}
>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
