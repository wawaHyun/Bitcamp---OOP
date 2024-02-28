package view;

import builder.BoardBuilder;
import model.BoardDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void boMain() {
        List<BoardDto> articles = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i =0;i<7;i++) {
            articles.add(new BoardBuilder()
                    .title(util.createRandomTitles())
                    .content(util.createRandomContents())
                    .writer(util.createRandomName())
                    .build());

        }

        //확장된 for문
//        for(BoardDto boDto : articles){
//            System.out.println(boDto.getTitle()+" :\t"+
//                    boDto.getContent()+" :\t"+
//                    boDto.getWriter());
//        }

        //for문 대신 쓰는 스트림
        articles.forEach(i->{
            System.out.println(i.toString());
        });


    }
}
