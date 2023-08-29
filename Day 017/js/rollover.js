/* 
    <a> 태그에서 정의된, onmoseover와 onmouseout에 의해서 호출되는 함수
    이미지 파일의 경로와 처리할 대상 요소(element)의 id값을 파라미터로 전달받아 처리함
*/
function changeImage(image, id) {
    // 파라미터로 전달받은 요소의 id값을 사용하여 image 객체로 만듬
    // 만들어진 이미지 객체의 src 속성값에 파라미터로 전달된 이미지 경로를 대입하여, 표시되는 이미지를 변경
    document.getElementById(id).src = image;
}