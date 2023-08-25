let user_id = prompt("아이디를 입력하세요");

if(user_id !="") {
    document.write("<h3> User ID : " + user_id + "</h3>");
} else {
    document.write("<h3>" + "ID를 입력해주세요" + "</h3>");
}

let result = confirm("로그아웃 하시곘습니까?");
if(result) {
    alert('로그아웃 되었습니다');
} else {
    alert("로그아웃 취소되었습니다.");
}