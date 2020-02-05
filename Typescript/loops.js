var nums = [11, 22, 33];
//classic loop
for (var i = 0; i < nums.length; i++) {
    console.log(nums[i]);
}
console.log("-------------------------");
//for ..of loop- directly element is taken
for (var _i = 0, nums_1 = nums; _i < nums_1.length; _i++) {
    var n = nums_1[_i];
    console.log(n);
}
console.log("-------------------------");
//for ..in loop-index is taken
for (var n_1 in nums) {
    console.log(n_1);
}
console.log("-------------------------");
for (var n_2 in nums) {
    console.log(nums[n_2]);
}
