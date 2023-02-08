# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        listLength=0
        start=start2=head
        while start:
            listLength+=1
            start=start.next
        middle=listLength//2
        count=0
        while start2:
            if count==middle:
                return start2
            else:
                count+=1
                start2=start2.next
        return None
