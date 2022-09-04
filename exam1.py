n = 1260
count = 0

coin_list= [500,100,50,10] # 큰 단위 화페부터 작은 단위 화페를 리스트에 담고

for i in coin_list:
    count += n//i # 해당 화폐로 거슬러 줄 수 있는 동전의 개수 세기 , n/i 라는뜻
    n%= i

print(count)