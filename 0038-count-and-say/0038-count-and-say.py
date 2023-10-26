class Solution:
    def countAndSay(self, n: int) -> str:
        def countSay(n):
            if n == 1:
                return "1"
            sequence = ""
            res = countSay(n-1)
            i = 0
            j = i
            while j < len(res):
                while j < len(res) and res[i] == res[j]:
                    j += 1
                count = j - i
                sequence += str(count)
                sequence += str(res[i])
                i = j
            return sequence
        return countSay(n)
        