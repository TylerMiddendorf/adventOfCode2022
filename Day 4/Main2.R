my_data <- read.delim("input.txt", header = FALSE, sep = ',')
my_new_data1 <- data.frame(do.call('rbind', strsplit(as.character(my_data$V1),'-',fixed=TRUE)))
my_new_data2 <- data.frame(do.call('rbind', strsplit(as.character(my_data$V2),'-',fixed=TRUE)))
combined_data <- cbind(my_new_data1,my_new_data2)
counter <- 0
for(row in 1:nrow(combined_data)){
      num1 <- as.integer(combined_data[row,1])
      num2 <- as.integer(combined_data[row,2])
      num3 <- as.integer(combined_data[row,3])
      num4 <- as.integer(combined_data[row,4])
      if(num2 >= num3 & num1 <= num4)
            counter <- counter + 1;
}
print(counter)