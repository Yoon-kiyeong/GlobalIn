let a = Number("a");
document.write("<h3> a = " + a + "</h3>");

let a_sum = a + 1;
document.write("<h3> a_sum = " + a_sum + "</h3>");
//"NaN" + 1 이지만 NaN1 이 아닌 NaN이 됨

let a_str = a + "str";
document.write("<h3> a_str = " + a_str + "</h3>");
//"NaN" + "str" 이므로 문자열 + 문자열이기 때문에 NaNstr이 출력 됨

//isNaN() : 변수의 값이 NaN인지 아닌지 확인하는 함수
//결과는 true, false로 호출됨

let v1 = "가나다라";
let v2 = "123456";
const v1_is = isNaN(v1);
const v2_is = isNaN(v2);
document.write("<h3> v1 = " + v1_is + "</h3>");
document.write("<h3> v2 = " + v2_is + "</h3>");

if(v1_is) {
    document.write("<h3>" + v1 + "은 숫자가 아닙니다.");
} else {
    document.write("<h3>" + v1 + "은 숫자입니다.");
}

if(v2_is) {
    document.write("<h3>" + v2 + "은 숫자가 아닙니다.");
} else {
    document.write("<h3>" + v2 + "은 숫자입니다.");
}