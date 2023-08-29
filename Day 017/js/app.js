function setFontColor(color) {
    //id 값이 box인 요소에 적용
    let box = document.getElementById("box");
    //글자의 색상을 파라미터로 전달받아 설정함
    box.style.color = color;
}

function setBgColor(color) {
    //id 값이 box인 요소에 적용
    let box = document.getElementById("box");
    //배경의 색상을 파라미터로 전달받아 설정함
    box.style.backgroundColor = color;
}

function setWidth(widTh) {
    //id 값이 box인 요소에 적용
    let box = document.getElementById("box");
    //가로의 길이를 파라미터로 전달받아 설정함
    box.style.width = widTh;
}

function changeClass(Class) {
    //id 값이 box인 요소에 적용
    let box = document.getElementById("box");
    //클래스의 이름을 파라미터로 전달받아 설정함
    box.className = Class;
}
