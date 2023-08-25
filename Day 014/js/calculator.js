function plus(x, y) {
    a = x + y;
    return a;
}

function minus(x, y) {
    var a = x - y;
    return a;

}

function multiple(x, y) {
    var a = x * y;
    return a;
}

function divide(x, y) {
    if (x < 0 || y < 0) {
        alert("입력값은 0보다 커야 합니다!!!");
    }
    var a = x / y;
    if (x <= 0 ) {
        alert("0은 나눌 수 없습니다!!!");
        return false;
    }
    return a;
}

function rest(x, y) {
    var a = x % y;
    return a;
}

var a = plus(10,20);
document.write("plus 함수 호출 결과 : " + a + '<br>');
var b = minus(20,10);
document.write("minus 함수 호출 결과 : " + b + '<br>');
var c = multiple(3,4);
document.write("multiple 함수 호출 결과 : " + c + '<br>');
var d = divide(12,6);
document.write("divide 함수 호출 결과 : " + d + '<br>');
var e = rest(30,4);
document.write("rest 함수 호출 결과 : " + e + '<br>');
