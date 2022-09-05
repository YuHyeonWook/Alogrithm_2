# n,k,m을 공백으로 구분하여 입력받기
n,m,k= map(int, input().split())
# 배열(n)의 수를 공백으로 구분하여 입력받기
data= list(map(int,input().split()))

data.sort() # 입력받은 data수를 정렬 해서 인덱스를 구한다.
first = data[n-1] # 가장 큰 수를 구함
second = data[n-2] # 두번째로 큰 수를 구함

result = 0

while True:
    for i in range(k): # 가장 큰 수를 k번 더하기, 0~2 , 6+6+6
        if m==0: # 조건 만약 m이 0이 되면 while문을 나감
            break
        # 첫번째로 큰 수는 6번 나오고, 6+6+6 _ 6+6+6 _
        # m은 더해지는 수인데 m=8 이라서 6을 8번 더하지만 똑같은수6이 k(3)번을 초과하면 안된다는 조건이 있다.   
        result += first     # result에 저장된 수를 첫번째로 큰 수로 더하기 
        m -= 1  # 더할 때마다 m-1씩 빼니까 result에 계속 값을 담는다.
    if m==0: # m이 0이 되면 while문을나감
        break
    # 두번째로 큰 수는 2번 나온다. , _ _ _+5+_ _ _+5
    result += second # result에 저장된 수를 두번째로 큰 수로 더하기 
    m -= 1  # 더할 때마다 m-1씩 빼니까 result에 계속 값을 담는다.

print(result)

# 정답 : 46
