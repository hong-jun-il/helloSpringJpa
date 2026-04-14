package kr.ac.hansung.cse.exception;

public class CategoryDependencyException extends RuntimeException{
    public CategoryDependencyException(long count) {
        super("해당 카테고리에 " + count + "개의 상품이 연결되어 있어 삭제할 수 없습니다.");
    }
}
