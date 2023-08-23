
/* for(초기값;조건식;증감값) {
         ①    ②      ④
③ 실행되는 문장: 조건이 만족할 때 수행되는 문장
  조건이 만족하지 않을 때 반복문 종료  
}
실행 순서 : 1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> ...
*/

var i, sum = 0; // 변수의 선언을 초기화
//반복문 : 1 ~ 10까지 수행
for (i = 0; i <= 10; i++) {
    sum = sum + i;
    document.write(i + " 값의 합계 : " + sum + '<br>');
}
document.write('<br>');
/*  
초기값;
while (조건식) {
실행되는 문장: 조건이 만족할 때 수행되는 문장
조건이 만족하지 않을 때 반복문 종료
}
*/

var a = 0 ; hap = 0;
while (a <= 10) {
    hap = hap + a;
    document.write(a + " 값의 합계 : " + hap + '<br>');
    a++;
}

document.write('<br>');

var num = 0; total = 0;
while (num <= 100) {
    if (num % 2 == 0) {
    total = total + num;
    document.write("짝수의 합계 : " + total + '<br>');
    }
    num++;
}

/*
    초기값: ①
    do {
        ② 실행되는 문장: 조건이 만족할 때 수행되는 문장
        조건이 만족하지 않을 때 반복문 종료
    i++; ③
    문장을 수행한 다음 증가 시킴
    실행 순서 : 1 -> 2 -> 3 -> 4 -> 2-> 3-> 4...
    } while( i <= 10); ④
*/ 
document.write('<br>');

var j = 1, all = 0;
do {
    all = all + j;
    document.write(j + " 값의 합계 : " + all + '<br>');
    j++;
} while (j <= 10);

document.write('<br>')

//구구단 출력
var q = 1//단을 저장하는 변수
for(q = 2; q < 10; q++) {
    for(w = 1; w <=9; w++){
        document.write(q + " * " + w + " = " + (q*w));
        document.write('<br>');
    }
}
document.write('<br>');

document.write("for문 구구단");
document.write('<br>');

var r = 7;
for(var e = 1; e <= 9; e++){
    document.write(r + " * " + e + " = " + (r*e));
    document.write('<br>');
}   
document.write('<br>');

document.write("while문 구구단");
document.write('<br>');

var z = 7, x = 1;
while (x <= 9) {
    document.write(z + " * " + x + " = " + (z*x));
    document.write('<br>');
    x++;
}
document.write('<br>')

document.write("do-while문 구구단");
document.write('<br>');

var d = 7, f = 1;
do {
    document.write(d + " * " + f + " = " + (d*f));
    document.write('<br>');
    f++;
} while(f <= 9);
document.write('<br>');

