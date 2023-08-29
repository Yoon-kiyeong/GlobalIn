function doSubmit() {
    // 폼 객체
    let frm = document.form1;

    // text 타입의 입력 여부 검사
    if (!frm.user_name.value) {
        alert("이름을 입력해주세요");
        frm.user_name.focus();
        return false;
    }

    // 라디오 버튼 입력 여부 검사
    if(!frm.gender[0].checked && !frm.gender[1].checked) {
        alert("성별을 입력해주세요");
        frm.gender[0].focus();
        return false;
    }

    // select에 대한 선택여부 검사
    if(frm.job.selectedIndex < 1) {
        alert("직업을 입력해주세요");
        frm.job.focus();
        return false;
    }
    
    // 체크박스의 선택여부 검사
    let chk = false;
    for(let i = 0; i < frm.hobby.length; i++) {
        if(frm.hobby[i].checked) {
            chk = true;
            break;
        }
    }

    if(!chk) {
        alert("취미를 선택해주세요");
        frm.hobby[0].focus;
        return false;
    }

    // 입력확인하기
    if(confirm("입력하신 내용이 맞습니까?")) {
        frm.submit();
    }
}