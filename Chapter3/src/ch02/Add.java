package ch02;

@FunctionalInterface // 내부에 여러개의 method를 선언하면 에러가 남
public interface Add {

	int add(int x, int y);
	//int sub(int x, int y); 를 쓰면 public interface Add <-여기서 오류가 남 {
}
