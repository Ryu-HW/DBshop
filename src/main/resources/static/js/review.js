document.getElementById('reviewForm').addEventListener('submit', function(e) {

    e.preventDefault();

    const review = {
      product_id: document.getElementById('review_product_id').value,
      user_id: document.getElementById('review_user_id').value,
      order_id: document.getElementById('review_order_id').value,
      rating: document.getElementById('review_rating').value,
      content: document.getElementById('review_content').value,
//      created_at: document.getElementById('review_created_at').value
    }

//    if(hasWhiteSpace(name.name)||hasSpecialChar(name.name)||startWithNumber(name.name)){
//    alert('입력값을 다시 확인해주세요')
//    }else{alert('서버로 전송합니다.')
//    }

    // fetch(요청주소, 요청내용객체)
    // 성공
    // 실패
    fetch("/reviews", {
        method: 'post',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(review)
    }).then(response => {
        if (response.ok) {
            alert('아이템이 성공적으로 생성되었습니다.');
            document.getElementById('reviewForm').reset();
        } else {
            alert('아이템 생성에 실패했습니다.');
        }
    }).catch(error => {
        console.error('Error:', error);
        alert('오류가 발생했습니다.');
    });
});