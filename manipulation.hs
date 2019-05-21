reverseNum :: String -> Integer -> String
reverseNum str num
 | num `mod` 2 == 0 = str
 | otherwise = reverse str

boustrophedon :: [String] -> [String]
boustrophedon list = [ reverseNum str x | str <- list, x <-[0..length list] ]