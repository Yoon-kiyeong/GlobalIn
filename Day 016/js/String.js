// 문자열 선연
let url = "http://www.google.com";
document.write("<p>" + "문자열: " + url + '</p>');

// 문자열의 글자 수
let len = url.length;
document.write("<p>" + "문자열의 길이: " + len + '</p>');

// 파라미터로 설정된 위치의 글자를 출력
let str3rd = url.charAt(3); //0부터 시작함 유의
document.write("<p>" + "문자열의 세번째 글자: " + str3rd + '</p>');

let p1 = url.indexOf('.');
document.write("<p>" + "'.'가 처음 나타난 위치 : " + p1 + '</p>');

let p2 = url.indexOf('.', p1 +1);
document.write("<p>" + "'.'가 두번째로 나타난 위치 : " + p2 + '</p>');

let p3 = url.lastIndexOf('.');
document.write("<p>" + "'.'가 마지막으로 나타난 위치 : " + p3 + '</p>');

// 문자열을 부분 추출하는 메소드
let substr = url.substring(0,5); //0부터 4까지(5-1)
document.write("<p>" + "문자열의 부분 출력(문자열 잘라내기) : " + substr + '</p>');

let substr2 = url.substring(0);
document.write("<p>" + "문자열의 부분 출력(문자열 잘라내기) : " + substr2 + '</p>');

let upper = url.toUpperCase(); //모든 문자열을 대문자로 변환하는 메소드
document.write("<p>" + "모든 문자를 대문자로 출력 : " + upper + '</p>');

let lower = url.toLowerCase(); //모든 문자열을 소문자로 변환하는 메소드
document.write("<p>" + "모든 문자를 소문자로 출력 : " + lower + '</p>');

