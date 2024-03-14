<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/goodgag/styles/common.css">
    <link rel="stylesheet" href="./styles/">
    <link rel="stylesheet" href="/goodgag/styles/mobile.common.css">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">


</head>
<body>
    <div class="aside-menu">
        <ul>
            <li>마이페이지</li>
            <li>글쓰기</li>
            <li>로그인</li>
            <li>로그아웃</li>
            <li>회원가입</li>
            <li onclick="document.getElementsByClassName('aside-menu')[0].style.display='none'">닫기</li>

        </ul>
    </div>
    <div class="go-to-top">
        <p>↑</p>
        <p>TOP</p>
    </div>
    <div class="container">
        <div class="header">
            <div class="header-logo">
                <img class="hamburger" src="assets/hamburger.png" onclick="document.getElementsByClassName('aside-menu')[0].style.display='block'" />
                <img class="header-logo-list-item" src="assets/logo.png" alt="고급유머" />
                <img class="header-logo-list-item" src="assets/my.png" alt="고급유머 작성" />
                <img class="header-logo-list-item" src="assets/write.png" alt="고급유머 작성" /> -->
            </div>
            <div class="header-category"> 
                <ul class="header-category-list">
                    <li class="header-category-list-item">잇슈</li>
                    <li class="header-category-list-item">익게</li>  
                </ul>   
            </div>
        </div>
        
        <div class="regist-content">
            <form class="regist-form">
                <h1 class="no-margin bottom-border">약관동의</h1>
                <div class="h-margin-16">
                    <div class="inline-block text-align-left w-half">
                        <lable for="regist-form-agree">아래 약관에 동의합니다. (필수)</lable>
                    </div>
                    <div class="inline-block text-align-right">
                        <input id="regist-form-agree" type="checkbox" />
                    </div>
                </div>
                <div class="terms-agreement">약관정보Viewport Size for Devices
                    Now a days Smart Phones have very High Display Resolution, A small 6-inch device have same display dimensions which a 32-inch LCD have, How it is possible?
                    
                    Device Dimensions which is also known as resolution is based upon Pixel Per Inch. The devices which have higher resolution in small display, their ONE pixel contains many more pixels, thats why Retina Display or Device Dimensions got bigger. However device actual dimensions depends on actual Pixels Per Inch which is called "Viewport Size" of device or "device-width". Responsive Websites CSS styles are based upon Viewport sizes of devices. Below is a detailed comparison list of Viewport Size for devices, Phone Dimensions, Screen Sizes and Devices Resolution:
                    
                    Please note that, Some phones changes their Viewport Size with change of Resolution or Screen Zoom, here we just write default Resolution behaviour. For detailed articles on viewport click here.</div>
                <input type="email" placeholder="E-Mail" />
                <input type="password" placeholder="비밀번호"/>
                <input type="text" placeholder="닉네임"/>
                <button>회원가입</button>
                <!-- <input type="button" value="회원가입2" /> -->
            </form>
        </div>
    
        <div class="footer">
            <div class="footer-button-area">
                <button class="footer-button-area-login-btn">로그인</button>
            </div>
            <div class="footer-copyright">Kt Ds University</div>
        </div>
    </div>
</body>
</html>