# log4j_hourly_rotate

## 概要

log4jのDailyRollingFileAppenderで日時ローテ以外（時間ローテ、分ローテ）できることを確認する。  
（あくまでlog4j。log4j2ではない。）

## properties

```properties : src/test/resources/log4j_hourly.properties
log4j.category.com.example.log4j.hourly.rotate=DEBUG,A1
log4j.appender.A1=org.apache.log4j.DailyRollingFileAppender
log4j.appender.A1.DatePattern='.'yyyy-MM-dd-HH-mm
log4j.appender.A1.File=logs/tracelog
log4j.appender.A1.layout=org.apache.log4j.PatternLayout
log4j.appender.A1.layout.ConversionPattern=%d{yyyy/MM/dd HH:mm:ss,SSS}, %m%n
```

## 実行結果

```
total 20
-rw-rw-r-- 1 ec2-user ec2-user 450 Sep  4 11:04 tracelog
-rw-rw-r-- 1 ec2-user ec2-user 180 Sep  4 11:00 tracelog.2020-09-04-11-00
-rw-rw-r-- 1 ec2-user ec2-user 540 Sep  4 11:01 tracelog.2020-09-04-11-01
-rw-rw-r-- 1 ec2-user ec2-user 540 Sep  4 11:02 tracelog.2020-09-04-11-02
-rw-rw-r-- 1 ec2-user ec2-user 540 Sep  4 11:03 tracelog.2020-09-04-11-03
```
