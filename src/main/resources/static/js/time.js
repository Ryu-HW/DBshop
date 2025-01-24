
  function updateTime() {
    const now = new Date();

    // 연, 월, 일, 시, 분, 초를 적절한 형식으로 만들기
    const year = now.getFullYear();
    const month = String(now.getMonth() + 1).padStart(2, '0'); // 월은 0부터 시작하므로 +1
    const day = String(now.getDate()).padStart(2, '0');
    const hours = String(now.getHours()).padStart(2, '0');
    const minutes = String(now.getMinutes()).padStart(2, '0');
    const seconds = String(now.getSeconds()).padStart(2, '0');

    // 날짜와 시간 형식 "yyyy-MM-dd HH:mm:ss"
    const datetimeValue = `${year}-${month}-${day} ${hours}:${minutes}:${seconds}`;

    // input 필드에 원하는 형식으로 값 설정
    document.getElementById('review_created_at').value = datetimeValue;
  }

  // 1초마다 시간을 갱신
  setInterval(updateTime, 1000);

  // 페이지 로드 시 한 번 초기화
  updateTime();
