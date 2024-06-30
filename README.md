# Pokedex
## Tổng quan
<p align="center"> 
Ứng dụng được xây dựng cho thiết bị Android để xem danh sách các Pokemon (những sinh vật hư cấu trong tựa game cùng tên) sử dụng Coroutines, Retrofit, ViewModel và một số thư viện giao diện dựa trên kiến trúc MVVM.
</p>
<br />

* API được xây dựng bằng [MockAPI](https://mockapi.io).
* Giao diện tham khảo tại: [Pokédex (Community) – Figma](https://www.figma.com/design/Qdjq8j5u356W2VE7fkq831/Pok%C3%A9dex-(Community)?node-id=0-1&t=4tloxBCL35xqvnit-0).
* Công nghệ sử dụng: ở dưới.
## Công nghệ và thư viện sử dụng
* Minimun SDK: *24*.
* Ngôn ngữ: *Kotlin*.
* Jetpack:
    * ViewModel:  Lưu trữ dữ liệu của View.
* Kiến trúc:
    * MVVM: Model - View - Model.
* Corountine: xử lý bất đồng bộ.
* Retrofit2 & OkHttp3: call API.
* Glide: Hiển thị hình ảnh từ network.
* Navigation component: điều hướng giữa các Fragment.
* Custom View:
    * [TransformationLayout](https://github.com/skydoves/transformationlayout): Tạo hiệu ứng Morph khi chuyển màn.
    * [ProgressView](https://github.com/skydoves/progressview): Custom progress view.
## Các chức năng chính
* Xem danh sách Pokemon.
* Xem chi tiết Pokemon.
* Tìm kiếm Pokemon.
### 1. Xem danh sách
<img src="/preview/list.gif" width="270"/>

### 2. Xem chi tiết
<img src="/preview/detail.gif" width="270"/>

### 3. Tìm kiếm
<img src="/preview/search.gif" width="270"/>