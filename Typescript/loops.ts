var nums:number[]=[11,22,33];
 //classic loop
 for(var i=0;i<nums.length;i++){
     console.log(nums[i]);
 }
 console.log("-------------------------")
 //for ..of loop- directly element is taken
 for(var n of nums)
 console.log(n)
 console.log("-------------------------")

 //for ..in loop-index is taken
 for(let n in nums){
 console.log(n)
 }
console.log("-------------------------")
for(let n in nums){
    console.log(nums[n])
   }