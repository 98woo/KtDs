<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>고급유머</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&family=PT+Sans+Narrow:wght@400;700&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="/goodgag/styles/common.css">
    <link rel="stylesheet" href="/goodgag/styles/mobile.common.css">
</head>
<body>
    <div class="aside-menu">
        <ul>
            <li>마이페이지</li>
            <li>글쓰기</li>
            <li>로그인</li>
            <li>로그아웃</li>
            <li>회원가입</li>
            <li onclick="document.getElementsByClassName('aside-menu')[0].style.display = 'none'">닫기</li>
        </ul>
    </div>
    <div class="go-to-top">
        <p>↑</p>
        <p>TOP</p>
    </div>
    <div class="container">
        <div class="header">
            <div class="header-logo">
                <div class="inline-block hamburger"
                     onclick="document.getElementsByClassName('aside-menu')[0].style.display = 'block'">
                </div>
                <div>
                    <div class="inline-block"></div>
                </div>
                <div class="inline-block"></div>
                <div class="inline-block"></div>
            </div>
            <div class="header-category">
                <ul class="header-category-list">
                    <li class="header-category-list-item header-category-active-item">잇슈</li>
                    <li class="header-category-list-item">익게</li>
                </ul>
            </div>
        </div>
        <div class="content">
            <div class="content-article">
                <h3 class="content-article-title">
                    <a href="./details.html">한국인의 삼겹살 사랑에 놀란 루마니아 마트 사장님</a>
                    <span class="content-article-title-reply-count">[23]</span>
                </h3>
                <ul class="content-article-author-info-list">
                    <li class="content-article-author">개드립</li>
                    <li class="content-article-number">No.232710</li>
                    <li class="content-article-create-date">08:03</li>
                </ul>
            </div>
            <div class="content-article">
                <h3 class="content-article-title">
                    <a href="./details.html">한국인의 삼겹살 사랑에 놀란 루마니아 마트 사장님</a>
                    <span class="content-article-title-reply-count">[23]</span>
                </h3>
                <ul class="content-article-author-info-list">
                    <li class="content-article-author">개드립</li>
                    <li class="content-article-number">No.232710</li>
                    <li class="content-article-create-date">08:03</li>
                </ul>
                <div class="best-article">BEST</div>
            </div>
            <div class="content-article">
                <h3 class="content-article-title">
                    <a href="./details.html">한국인의 삼겹살 사랑에 놀란 루마니아 마트 사장님</a>
                    <span class="content-article-title-reply-count">[23]</span>
                </h3>
                <ul class="content-article-author-info-list">
                    <li class="content-article-author">개드립</li>
                    <li class="content-article-number">No.232710</li>
                    <li class="content-article-create-date">08:03</li>
                </ul>
            </div>
            <div class="content-article">
                <h3 class="content-article-title">
                    <a href="./details.html">한국인의 삼겹살 사랑에 놀란 루마니아 마트 사장님</a>
                    <span class="content-article-title-reply-count">[23]</span>
                </h3>
                <ul class="content-article-author-info-list">
                    <li class="content-article-author">개드립</li>
                    <li class="content-article-number">No.232710</li>
                    <li class="content-article-create-date">08:03</li>
                </ul>
                <div class="best-article">BEST</div>
            </div>
            <div class="content-article">
                <h3 class="content-article-title">
                    <a href="./details.html">한국인의 삼겹살 사랑에 놀란 루마니아 마트 사장님</a>
                    <span class="content-article-title-reply-count">[23]</span>
                </h3>
                <ul class="content-article-author-info-list">
                    <li class="content-article-author">개드립</li>
                    <li class="content-article-number">No.232710</li>
                    <li class="content-article-create-date">08:03</li>
                </ul>
            </div>
        </div>
        <div class="search-area">
            <form class="search-form">
                <label class="search-title" for="search-type">검색종류</label>
                <select class="search-input" id="search-type">
                    <option>전체</option>
                    <option>작성자</option>
                    <option>내용</option>
                    <option>작성자+내용</option>
                    <option>글번호</option>
                </select>

                <label class="search-title" for="search-keyword">검색어</label>
                <input class="search-input" id="search-keyword" />
                <button class="search-button">검색</button>
            </form>
        </div>
        <div class="paginator">
            <ul class="paginator-list">
                <li class="paginator-page-number paginator-active-page">
                    <a href="./index.html">1</a>
                </li>
                <li class="paginator-page-number">
                    <a href="./index.html">2</a>
                </li>
                <li class="paginator-page-number">
                    <a href="./index.html">3</a>
                </li>
                <li class="paginator-page-number">
                    <a href="./index.html">4</a>
                </li>
                <li class="paginator-page-number">
                    <a href="./index.html">5</a>
                </li>
                <li class="paginator-page-number">
                    <a href="./index.html">다음</a>
                </li>
            </ul>
        </div>
        <div class="footer">
            <div class="footer-button-area">
                <button class="footer-button-area-login-btn">로그인</button>
            </div>
            <div class="footer-copyright">ktds University</div>
        </div>
    </div>
</body>
</html>