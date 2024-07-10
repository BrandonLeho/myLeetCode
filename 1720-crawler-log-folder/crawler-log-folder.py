class Solution:
    def minOperations(self, logs: List[str]) -> int:
        output = 0
        for log in logs:
            if log != "../" and log != "./":
                output += 1
            elif log == "../" and output > 0:
                output -= 1
        return output
