document.getElementById('categoryForm').addEventListener('submit', function(e) {

    e.preventDefault();

    const category = {
        category_name: document.getElementById('category_name').value,  // 아이템을 category_name으로 수정
    }

    // fetch(요청주소, 요청내용객체)
    fetch("/category", {  // 서버에서 '/category'로 받아서 처리하는 방식
        method: 'post',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(category)
    }).then(response => {
        if (response.ok) {
            alert('카테고리가 성공적으로 생성되었습니다.');
            document.getElementById('categoryForm').reset();  // 폼 리셋
        } else {
            alert('카테고리 생성에 실패했습니다.');
        }
    }).catch(error => {
        console.error('Error:', error);
        alert('오류가 발생했습니다.');
    });
});
