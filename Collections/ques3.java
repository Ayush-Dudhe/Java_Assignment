String str = "E_1000, E_1005,E_1010 , E_1015,E_1020,E_1025";
List<String> splitStr = Arrays.stream(str.split(","))
    .map(String::trim)
    .collect(Collectors.toList());