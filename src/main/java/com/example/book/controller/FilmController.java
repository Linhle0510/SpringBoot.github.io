package com.example.book.controller;

import java.util.List;

import com.example.book.model.Film;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class FilmController {
        @GetMapping("/film")
        public String listFilm(Model model) {
                List<Film> film = List.of(new Film("Titanic",
                                "Phim lấy ý tưởng dựa trên vụ đắm tàu RMS Titanic nổi tiếng trong lịch sử vào năm 1912. Phim tập trung vào câu chuyện tình yêu giữa Rose Dewitt Bukater và Jack Dawson",
                                " James Cameron", 1997),
                                new Film("Lion King",
                                                "Bộ phim hoạt hình này kể về một chú sư tử nhỏ tên Simba, cố gắng lãnh đạo vương quốc động vật sau khi cha là Mufasa bị giết hại tàn nhẫn bởi người chú ghen tị Scar",
                                                " Roger Allers, Rob Minkoffs", 1994),
                                new Film("Nhà Tù Shawshank - The Shawshank Redemption",
                                                "Phim kể về quá trình vượt ngục của Andrew, một nhân viên nhà băng, bị kết án chung thân và bị giam tại nhà tù Shawshank sau khi giết vợ và nhân tình của cô",
                                                " Frank Darabont", 1994),

                                new Film("Bố Già - The Godfather",
                                                "Phim xoay quanh diễn biến của gia đình mafia gốc Ý Corleone trong khoảng 10 năm từ 1945 - 1955",
                                                "Francis Ford Coppola", 1972),

                                new Film("Hiệp Sĩ Bóng Đêm - The Dark Knight",
                                                "Phim kể về Joker - kẻ gây ra hàng loạt vụ giết người, được các băng đảng trong thành phố thuê để trừ khử Người Dơi. Và từ đó, Batman là người đứng lên bảo vệ cả thành phố khỏi âm mưu xấu xa của Joker",
                                                "Christopher Nolan", 2008));

                model.addAttribute("film", film);
                return "film";
        }
}
