/* 배열 :
    - 하나의 값 안에 여러 개의 변수를 그룹화 하는 단위
    배열이 생성되면 그 안의 값들은 0부터 순서대로 일련의 번호를 부여받는다.
    배열의 순서를 배열의 인덱스
    */

// 배열의 생성
let myArray = new Array("홍길동", "활빈당", "보스");
let myArray2 = [
    "홍길동", "활빈당", "보스"
]

//배열에 저장된 값 불러오기
document.write("<h3>" + myArray[0] + "</h3>");
document.write("<h3>" + myArray[1] + "</h3>");
document.write("<h3>" + myArray[2] + "</h3>");
document.write("<h3>" + myArray[0] + "</h3>");
document.write("<h3>" + myArray[1] + "</h3>");
document.write("<h3>" + myArray[2] + "</h3>");

//배열에 저장된 값 변경
myArray[0] = "Gi Yeong Yoon";
myArray[1] = "JavaScript";
myArray[2] = "Developer";

//변경된 값이 출력 됨
document.write("<h3>" + myArray[0] + "</h3>");
document.write("<h3>" + myArray[1] + "</h3>");
document.write("<h3>" + myArray[2] + "</h3>");

//빈 배열 생성
let myArray3 = new Array();
let myArray4 = new Array();
let myArray5 = [];

for (let i = 0; i < 10; i++) {
    myArray3[i] = i;
}

document.write("<h3>" + "배열의 길이 : " + myArray3.length + "</h3>");

for (let i = 0; i < 10; i++) {
    myArray4[i] = i;
    document.write("<h3>" + myArray4[i] + "</h3>");
}

//2차원 배열 생성
let myArray6 = [["홍길동", "활빈당", "보스"],
    ["이순신", "명량대첩", "조선의 장군"],
    ["김유신", "삼국통일", "신라의 장군"]
];

for(let i = 0; i < myArray6.length; i++) {  //myArray6.length : 2차원 배열의 행의 길이를 의미함
    for(let j = 0; j < myArray6[i].length; j++){ //myArray6[i].length : i번쨰 줄의 열의 길이를 의미함
        document.write("<h1>" + myArray6[i][j] + "</h3>");
    }
}

let str = "홍길동, 500세, 남자, 멋짐";
//콤마를 기준으로 문자열을 구분해서 배열로 리턴함

//split : 헤당 문자를 기준으로 문자열을 나누는 메소드
let data = str.split(",");

for(let i = 0; i < data.length; i ++) {
    document.write("<h1>" + data[i] + "</h3>");
}





































