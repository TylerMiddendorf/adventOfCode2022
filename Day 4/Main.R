my_data <- read.delim("input.txt", header = FALSE, sep = ',')
data <- cbind(data.frame(do.call('rbind', strsplit(as.character(my_data$V1),'-',fixed=TRUE)))
                  ,data.frame(do.call('rbind', strsplit(as.character(my_data$V2),'-',fixed=TRUE))))
counter <- 0
for(row in 1:nrow(data))
      if((as.integer(data[row,1]) <= as.integer(data[row,3]) 
      & as.integer(data[row,2]) >= as.integer(data[row,4])) 
      | (as.integer(data[row,1]) >= as.integer(data[row,3]) 
      & as.integer(data[row,2]) <= as.integer(data[row,4])))
            counter <- counter + 1
print(counter)