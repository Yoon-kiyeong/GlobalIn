// 링크에 의해서 함수 호출
function setImage(index) {
    // 이미지 경로를 저장하고 있는 배열
    let imageList = [
        './img/whaleshark.png','./img/ShihTzu.png','./img/pomeranian.png'
    ];
    
    // 이미지 객체화
    let image = document.getElementById('target');
    // 이미지 객체의 src 속성에 배열 값 중에서 파라미터로 전달된 위치 값으로 설정됨
    image.src = imageList[index];
}