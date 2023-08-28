//두 수 사이의 난수를 리턴 함수 정의
function random(n1, n2) {
    return parseInt(Math.random() * (n2 - n1 + 1)) + n1;
}

function authNo() {
    //5자리 인증번호 생성
    let auth = "";
    for (let i = 0; i < 5; i++) {
        auth += random(0, 9);
    }
    document.getElementById('auth').innerHTML = auth;
}

function refresh() {
    location.reload();
} // 페이지 새로고침
