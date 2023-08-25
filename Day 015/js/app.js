//함수 내에 또 다른 함수 호출
//두 개의 파라미터 값을 받아서 계산하는 함수
function sum(x, y) {
    let z = x + y;
    return z;
}

//결과를 출력하는 함수
function printResult(x, y) {
    let result = sum(x,y);
    document.write("<h1>" + result + "</h1>");
    console.log(result);
}

printResult(10,20);

//eval() : 사용자가 입력한 내용을 수식으로 변환하거나, 문자열을 실제 값 그대로 변환하는 함수
let str = "100 + 1";
let evak = eval(str);
document.write("<h3>" + str + "</h3>");
document.write("<h3>" + evak + "</h3>");
document.write("<br>");

/////문자열을 숫자로 변환시키는 함수 : number(), parseint()
let value = "100.6";
let v = value + 1; //문자열 + 숫자 = 문자열

let num1 = Number(value);
let num2 = parseInt(value);
let num3 = num1 + 1; //숫자 + 숫자 = 덧셈
let num4 = num2 + 1;
document.write("<h3>" + num1 + '</h3>');
document.write("<h3>" + num2 + '</h3>');
document.write("<h3>" + v + "</h3>");
document.write("<h3>" + num3 + '</h3>');
document.write("<h3>" + num4 + "</h3>");

