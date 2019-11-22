package ru.ivt.base;

public class BaseResearch {

    public static final String FORMAT_STRING = "hdfs://claster@%s:%s%s%s";

    public static Integer scale = 10;
    public static String nameNodeData = "namenode";
    public static String portNameNodeData = "8020";
    public static String parquetName = "LC08_L1TP_142020_20190907_20190907_01_RT";
    public static String pathToParquet = "/user/claster/temp/parquet/";
    public static String pathResultToParquet = "/user/claster/flink/";

    public static String pathInput = String.format(FORMAT_STRING,nameNodeData,portNameNodeData,pathToParquet,parquetName);
    public static String pathOutput = String.format(FORMAT_STRING,nameNodeData,portNameNodeData,pathResultToParquet,parquetName);
    public static void initPath(String[] args){
        if (args.length!=0 && args.length!=1){
            scale = Integer.valueOf(args[0]);
            nameNodeData = args[1];
            portNameNodeData = args[2];
            parquetName = args[3];
            pathToParquet = args[4];
            pathInput = String.format(FORMAT_STRING,nameNodeData,portNameNodeData,pathToParquet,parquetName);
            pathOutput = String.format(FORMAT_STRING,nameNodeData,portNameNodeData,pathResultToParquet,parquetName);
        } else if (args.length == 1){
            scale = Integer.valueOf(args[0]);
        }
    }
}
