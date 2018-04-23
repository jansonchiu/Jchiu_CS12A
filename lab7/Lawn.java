#! /bin/bash
# Lawn
#
#
#

echo "Enter the length and width of the lot, in feet:"
read lot1 lot2
echo "Enter the length and width of the house, in feet:"
read house1 house2
areaLot=$(echo "lot1*lot2" | bc }
areaHouse=$(echo "house1*house2" | bc )
area=$(echo "scale=5;$areaLot-$areaHouse" | bc )
echo "The lawn area is $area square feet."
echo "Enter the mowing rate, in square feet per second:"
read mowingRate
sec=$(echo "scale=5;$area/$mowingRate" | bc )
mowingRate =$(echo "scale=5")
s=$( echo "if($sec%1>.5){$sec/1+1}else{$sec/1}" | bc )
m=$( echo "$s/60" | bc )
s=$( echo "$%%60" | bc )
h=$( echo "$m/60" | bc )
m=$( echo "$m%60" | bc )
echo "The mowing time is $h hours, #m minutes and $s seconds."
