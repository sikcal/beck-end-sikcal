package com.prob_jr.sikcal_app.domain.service.dto;


import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

//필요한정보 생각해보기
// 탄단지 정보, 들어가는 재료 이름들, 레시피(준비재료, 조리순서 포함)  그림
@Data
@NoArgsConstructor
public class RecipeDto {
    String memberid;
    String totalkcal;
    String requiredfood;
    String recipe;
    //QueryDsl을 이용해서 dto와 같은형식으로 projection해서 받아오고 싶음
    @QueryProjection
    public RecipeDto(String memberid, String totalkcal, String requiredfood, String recipe) {
        this.memberid = memberid;
        this.totalkcal = totalkcal;
        this.requiredfood = requiredfood;
        this.recipe = recipe;
    }
}