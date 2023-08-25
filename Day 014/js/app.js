/*중첩 for 문
for(초기값;조건식;증감값) { 행
      1     2      3
    for(초기값;조건식;증감값) { 열
          4     5      6
        반복수행할 문장
    }
}
*/

var i, j;
for(i = 1; i < 5; i++) {
    for(j = 0; j <=5; j++) {
        document.write("*");
    }
    document.write('<br>');
}

document.write('<br>');

var a, b;
for (a = 1; a <=5; a++) {
    for(b = 1; b <=5; b++) {
        document.write("(" + a + ", " + b + ")");
    }
    document.write('<br>');
}

document.write('<br>');

var d, f;
for (d = 2; d <=19; d++) { //행 (2 ~ 19)
    for (f = 1; f<=9; f++) { //열 (1 ~ 9까지 반복 수행)
        document.write('<li>' + d + " * " + f + " = " + (d*f) + '</li>');
    }
    //행(줄)바꿈
    document.write('<br>');
}

document.write('<br>');
document.write("while문 구구단");
document.write('<br>');

var q = 2;
while (q <= 9) {
    var w = 1;
    while(w <= 9) {
        document.write('<li>' + q + " * " + w + " = " + (q*w) + '</li>');
        w++;
    }
    q++;
    document.write('<br>');
}

document.write('<br>');
document.write("do-while문 구구단");
document.write('<br>');

var e = 2; r = 1;
do {
    do {
    document.write('<li>' + e + " * " + r + " = " + (e * r) + '</li>');
    r++;
    } while(r <= 9);
e++;
r = 1;
document.write('<br>');
} while(e <= 9);

document.write('<br>');
document.write("for문으로 테이블 만들기");
document.write('<br>');

document.write("<table width='80%' border = '1' style='margin:auto; text-align:center; background-color:blue; color:white;'>");
var k,u;
for(k = 0; k < 6; k++) {
    document.write('<tr>');
        for(u = 0; u < 7; u++) {
            document.write("<td>(" + k + ","+ u +")</td>");
        }
    document.write('</tr>');
}
document.write('</table>');










