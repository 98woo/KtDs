<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>영화등록</title>
    </head>
    <body>
        <h1>영화 등록</h1>

        <form action="/watcha_web/movie-regist" method="post">
            <div>
                <label>영화 이름</label>
                <input type="text" name="title" />
            </div>
            <div>
            <label>영화 관람등급</label>
                <select name="minimumAge">
                    <option value="0">전체관람가</option>
                    <option value="7">7세 이상 관람가</option>
                    <option value="12">12세 이상 관람가</option>
                    <option value="15">15세 이상 관람가</option>
                    <option value="19">19세 이상 관람가</option>
                </select>
            </div>
            <div>
                <label>장르</label>
                <input type="radio" name="genre" value="코미디"/>코미디
                <input type="radio" name="genre" value="액션"/>액션
                <input type="radio" name="genre" value="스릴러"/>스릴러
                <input type="radio" name="genre" value="호러"/>호러
            </div>
            <div>
                <label>촬영국가</label>
                <input type="text" name="location" />
            </div>
            <div>
                <label>줄거리</label>
                <textarea name="summary"></textarea>
            </div>
            <input type="reset" value="취소">
            <input type="submit" value="등록" />
        </form>
    </body>
</html>