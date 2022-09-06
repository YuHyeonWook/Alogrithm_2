# n,k,m을 공백으로 구분하여 입력받기
n,m,k= map(int, input().split())
# 배열(n)의 수를 공백으로 구분하여 입력받기
data= list(map(int,input().split()))

data.sort() # 입력받은 data수를 정렬 해서 인덱스를 구한다.
first = data[n-1] # 가장 큰 수를 구함
second = data[n-2] # 두번째로 큰 수를 구함

count = int(m/(k+1))*k
count += m % (k+1)

result = 0
result += (count) * first
result += (m-count) * second


print(result)

