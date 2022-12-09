ĐỀ BÀI (đề 1)
Xây dựng lớp Point trên mặt phẳng 2 chiều gồm:
- Các thuộc tính: hoành độ x, tung độ y.
- Các phương thức: get, set, constructor, input, output.
Xây dựng lớp LineSegment gồm:
- Các thuộc tính: tọa độ 2 điểm.
- Các phương thức: get, set, constructor, input, output, length.
Xây dựng lớp Triangle gồm:
- Các thuộc tính: tọa độ 3 đỉnh.
- Các phương thức: get, set, constructor, input, output, isValid,
perimeterCalculate, areaCalculate.
Xây dựng lớp Rectangle gồm:
- Các thuộc tính: tọa độ 4 đỉnh.
- Các phương thức: get, set, constructor, input, output, isValid,
perimeterCalculate, areaCalculate.
Viết chương trình cho phép lựa chọn nhập vào một LineSegment, Triangle,
Rectangle. Tính chiều dài (LineSegment), chu vi (Triangle, Rectangle), diện tích
(Triangle, Rectangle).


Gợi ý:
- Xây dựng abtract class Geometry chứa các abtract function: input, output,
isValid, perimeterCalculate, areaCalculate.
- Kiểm tra tính song song:
Để xác định hai vector U và V có song song với nhau hay không, ta kiểm tra
các vector đã cho có thể biểu diễn dưới dạng bội vô hướng của nhau hay
không?
Vector U và V song song ➔ 𝑈 = 𝑡 ∗ 𝑉, 𝑡 ∈ 𝑅
- Kiểm tra tính vuông góc:
Để xác định hai vector U(xU, yU) và V(xV, yV) có vuông góc với nhau hay
không, ta kiểm tra tích vô hướng của U và V
𝑈⃗ ⊥ 𝑉⃗ ⇔ 𝑈⃗ . 𝑉⃗ = 0 ⇔ 𝑥𝑈𝑥𝑈 + 𝑦𝑈𝑦𝑉=0


