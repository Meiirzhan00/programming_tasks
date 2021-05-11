def findSmallest(arr):
   smallest=arr[0]
   smallest_index=0

   for i in range(1,len(arr)):
     if arr[i] < smallest:
       smallest=arr[i]
       smallest_index=i
   return smallest_index

def findBiggest(arr):
   biggest=arr[0]
   biggest_index=0

   for i in range(1,len(arr)):
     if arr[i] > biggest:
       biggest=arr[i]
       biggest_index=i
   return biggest_index

def selectionSort(arr):
    newArr=[]
    for i in range(int(len(arr)/2)):
        smallest = findSmallest(arr)
        newArr.append(arr.pop(smallest))
        biggest = findBiggest((arr))
        newArr.append(arr.pop(biggest))

    return newArr

print(selectionSort([10, 4, 2, 6, 5, 8, 7, 1, 3, 9]))


# def selectionSort(arr):
#     newArr=[]
#     for i in range(int(len(arr)/2)):
#         minn=min(arr)
#         newArr.append(minn)
#         arr.remove(minn)
#         maxx=max(arr)
#         newArr.append(maxx)
#         arr.remove(maxx)
#
#     return newArr
#
# print(selectionSort([10, 4, 2, 6, 5, 8, 7, 1, 3, 9]))


