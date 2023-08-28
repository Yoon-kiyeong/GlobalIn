// date 객체 생성
// 객체 안에는 기본적으로 현재 날짜와 시간이 저장 되어 있음
let myDate = new Date(); //Date() : 생성자 함수
// let myDate = new Date(년, 월-1, 일);

document.write("<h3> 오늘의 날짜 : " + myDate + "</h3>");

//Date 객체에 저장된 시간을 임의로 변경하여 처리
//ex) 2023년 8월 1일

myDate.setFullYear(2023);
myDate.setMonth(7);
myDate.setDate(1);

myDate.setHours(14);
myDate.setMinutes(30);
myDate.setSeconds(30);

//요일의 이름을 저장하는 배열 생성
let days = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

//년, 월, 일, 시, 분, 초를 저장하는 배열 생성
let yy = myDate.getFullYear();
let mm = myDate.getMonth() + 1;
let dd = myDate.getDate(); 
//0: 일요일, 1: 월요일, 2: 화요일, 3: 수요일, 4: 목요일, 5: 금요일, 6: 토요일

let i = myDate.getDay();
let day = days[i];

//시, 분, 초
let hour = myDate.getHours();
let minute = myDate.getMinutes();
let second = myDate.getSeconds();

let result = yy + "-" + mm + "-" + dd + "-" + hour + "-" + minute + "-" + second;

document.write(result);
document.write("<br>");



































