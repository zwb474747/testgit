		import java.util.HashMap;
		import java.util.Map;
		import java.util.Objects;
		import java.util.Scanner;
		
				/**
		 * @Description 根据用户
		 * @Author jp
		 * @Date 2020/2/22 17:58
		 **/
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Map<String, String> map = new HashMap<>();
		        map.put("黑色", "30");
		        map.put("红色", "31");
		        map.put("绿色", "32");
		        map.put("黄色", "33");
		        map.put("蓝色", "34");
		        map.put("紫红色", "35");
		        map.put("青蓝色", "36");
		        map.put("白色", "37");
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("请输入想要的颜色：黑色，红色，绿色，黄色，蓝色，紫红色，青蓝色，白色");
		        String importText = scanner.next();
		        String colorCode = null;
		        for (String key : map.keySet()) {
		            if (Objects.equals(key, importText)) {
		                colorCode = map.get(importText);
		            }
		        }
		        System.out.println("\033[1;" + colorCode + "m" + importText + "\033[0m \n");
		        System.out.println("emmmmmmmm这是个啥");
		    }
		
	}


