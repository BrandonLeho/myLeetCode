class Solution:
    def maxDistance(self, position: List[int], m: int) -> int:
        output = 0
        position.sort()

        low = 1
        high = position[-1] - position[0] // (m - 1)

        while low <= high:
            mid = low + (high - low) // 2

            if self.canPlaceBalls(mid, position, m):
                output = mid
                low = mid + 1
            else:
                high = mid - 1
            
        return output

    def canPlaceBalls(self, x: int, position: List[int], m: int) -> bool:
        prevBallPos = position[0]
        ballsPlaced = 1

        for i in range(1, len(position)):
            currPos = position[i]
            if currPos - prevBallPos >= x:
                ballsPlaced += 1
                prevBallPos = currPos
            if ballsPlaced >= m:
                return True
        return False