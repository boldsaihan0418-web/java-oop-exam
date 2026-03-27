# 🚀 Java OOP Шалгалт — Сансрын Станц

![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)
![JUnit](https://img.shields.io/badge/JUnit-5-green?logo=junit5)
![AI Detection](https://img.shields.io/badge/AI%20Detection-Enabled-red)
![License](https://img.shields.io/badge/License-MIT-blue)

Сансрын станцын сэдэвтэй Java OOP шалгалт. 3 даалгавар, нийт **90 оноо**.

## 📋 Даалгаврууд

| # | Даалгавар | Оноо | Түвшин | Файл |
|---|-----------|------|--------|------|
| 1 | **SpaceShip** — Сансрын хөлөг | 25 | Дунд | `assignments/spaceship/` |
| 2 | **FoodStation** — Хоолны станц | 30 | Дунд+ | `assignments/foodstation/` |
| 3 | **CommSystem** — Холбооны систем | 35 | Хүнд | `assignments/commsystem/` |

## 🏗️ Хавтасны бүтэц

```
java-oop-exam/
├── README.md                          # Энэ файл
├── .gitignore
├── assignments/
│   ├── spaceship/
│   │   ├── SpaceShip.java             # ← Та энд код бичнэ
│   │   └── README.md                  # Даалгаврын заавар
│   ├── foodstation/
│   │   ├── FoodStation.java           # ← Та энд код бичнэ
│   │   └── README.md
│   └── commsystem/
│       ├── CommSystem.java            # ← Та энд код бичнэ
│       └── README.md
├── tests/
│   ├── SpaceShipTest.java             # JUnit 5 тестүүд
│   ├── FoodStationTest.java
│   └── CommSystemTest.java
├── scripts/
│   ├── run_tests.sh                   # Тест ажиллуулах скрипт
│   └── ai_detector.py                 # AI илрүүлэгч
└── .github/workflows/exam.yml         # GitHub Actions автомат шалгагч
```

## 🚀 Шалгалт өгөх заавар (Алхам алхмаар)

### Алхам 1: Repo-г Fork хийх

1. Браузераар [`UEFA-OPP/java-oop-exam`](https://github.com/UEFA-OPP/java-oop-exam) repo руу орно
2. Баруун дээд буланд байрлах **Fork** товч дарна
3. Owner-ээр **өөрийн account**-ийг сонгоод **Create fork** дарна
4. Та одоо `https://github.com/<таны-username>/java-oop-exam` гэсэн хуулбар repo-той боллоо

### Алхам 2: Компьютер дээрээ Clone хийх

```bash
# <таны-username> гэдгийг өөрийн GitHub username-ээр солино
git clone https://github.com/<таны-username>/java-oop-exam.git
cd java-oop-exam
```

> **Санамж:** SSH key тохируулсан бол `git@github.com:<таны-username>/java-oop-exam.git` ашиглаж болно.

### Алхам 3: Өөрийн нэрээр branch үүсгэх

```bash
# Жишээ: git checkout -b exam/bat-erdene
git checkout -b exam/<өөрийн-нэр>
```

> **Яагаад branch үүсгэх вэ?** `main` branch-д шууд бичвэл PR үүсгэх боломжгүй. Заавал шинэ branch дээр ажиллана.

### Алхам 4: Даалгаврын зааврыг унших

Даалгавар тус бүрийн хавтас дахь `README.md` файлыг нээж, шаардлагыг анхааралтай уншина:

```bash
# Даалгавар 1-ийн зааврыг харах
cat assignments/spaceship/README.md

# Даалгавар 2
cat assignments/foodstation/README.md

# Даалгавар 3
cat assignments/commsystem/README.md
```

### Алхам 5: Код бичих

`.java` файл дахь `// TODO` коммент бүрийг өөрийн кодоор солино:

| Даалгавар | Файл | Юу хийх |
|-----------|------|---------|
| 1 | `assignments/spaceship/SpaceShip.java` | Field, constructor, 4 method бичих |
| 2 | `assignments/foodstation/FoodStation.java` | Field, constructor, 4 method бичих |
| 3 | `assignments/commsystem/CommSystem.java` | Field, constructor, 5 method бичих |

> **Зөвлөгөө:** Даалгавар 1-ээс эхэлж, тест ажиллуулж зөв болгоод, дараагийнх руу шилжих нь илүү үр дүнтэй.

### Алхам 6: Локал тест ажиллуулах

Код бичсэний дараа тест ажиллуулж шалгана. JUnit jar автоматаар татагдана:

```bash
# Бүх даалгаврыг нэг дор шалгах
bash scripts/run_tests.sh

# Тодорхой даалгавар дангаар шалгах
bash scripts/run_tests.sh spaceship
bash scripts/run_tests.sh foodstation
bash scripts/run_tests.sh commsystem
```

Тест амжилттай бол ногоон ✓, амжилтгүй бол шар △ гарна. Алдааны мессежийг уншиж, кодоо засна.

**Жишээ output:**
```
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
  Даалгавар 1: SpaceShip
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
[1/3] Компайл хийж байна...
  ✓ Компайл амжилттай
[2/3] Тест ажиллуулж байна...
  ✓ Бүх тест амжилттай (16/16)
[3/3] AI Detection...
  ✅ LOW (Score: 4/121)
```

### Алхам 7: Commit хийх

Бүх тест амжилттай болсны дараа өөрийн кодыг commit хийнэ:

```bash
# Зөвхөн assignments/ хавтас дахь файлуудыг stage хийнэ
git add assignments/

# Commit мессежээ бичнэ
git commit -m "Шалгалтын хариулт - <таны нэр>"
```

> **Анхааруулга:** `tests/`, `scripts/`, `.github/` хавтсуудыг **commit хийхгүй**. Зөвхөн `assignments/` доторх файлуудыг илгээнэ.

### Алхам 8: GitHub руу Push хийх

```bash
# <өөрийн-нэр> гэдгийг Алхам 3 дээр үүсгэсэн branch нэрээр солино
git push origin exam/<өөрийн-нэр>
```

Хэрэв push хийх үед нууц үг асуувал GitHub Personal Access Token эсвэл SSH key шаардлагатай.

### Алхам 9: Pull Request (PR) үүсгэх

1. Браузераар **өөрийн fork** repo руу орно: `https://github.com/<таны-username>/java-oop-exam`
2. Дээд талд шар өнгийн **"Compare & pull request"** товч гарсан байна — дарна
3. Хэрэв товч харагдахгүй бол:
   - **Pull requests** таб → **New pull request** дарна
   - **base repository:** `UEFA-OPP/java-oop-exam` | **base:** `main`
   - **head repository:** `<таны-username>/java-oop-exam` | **compare:** `exam/<өөрийн-нэр>`
4. PR title-д **өөрийн нэр, бүлгийг** бичнэ. Жишээ: `Бат-Эрдэнэ - SE401`
5. **Create pull request** дарна

### Алхам 10: Автомат шалгалтын дүнг харах

PR үүсгэсний дараа **GitHub Actions** автоматаар ажиллана:

1. PR хуудасны доод талд **Checks** хэсэг гарна
2. Шар тойрог ⏳ = ажиллаж байна, Ногоон ✅ = амжилттай, Улаан ❌ = алдаатай
3. **Details** дарж дэлгэрэнгүй дүнг харна
4. PR-ийн доод хэсэгт **дүнгийн хүснэгт** автоматаар бичигдэнэ:

| Даалгавар | Оноо | Компайл & Тест | AI Detection |
|-----------|------|----------------|--------------|
| 1. SpaceShip | 25 | ✅ Pass | ✅ LOW (4) |
| 2. FoodStation | 30 | ⚠️ Partial | ✅ LOW (2) |
| 3. CommSystem | 35 | ❌ Compile Error | ❓ N/A |

> **Алдаатай бол?** Кодоо засаад дахин commit + push хийнэ. PR автоматаар шинэчлэгдэж, тест дахин ажиллана. Хэдэн ч удаа push хийж болно.

## 📊 Оноо тооцох систем

| Шалгуур | Тайлбар |
|---------|---------|
| **Компайл** | Код алдаагүй компайл болох |
| **JUnit тест** | Бүх тест амжилттай болох |
| **AI Detection** | AI ашигласан эсэх шалгах |

### AI Detection оноо
| Оноо | Түвшин | Тайлбар |
|------|--------|---------|
| 0-19 | ✅ LOW | AI шинж тэмдэг бага |
| 20-39 | ⚠️ MEDIUM | Зарим AI шинж тэмдэг |
| 40+ | 🚨 HIGH | AI ашигласан магадлал өндөр |

AI detector нь дараах 11 шалгуураар кодыг шинжилнэ:
1. Javadoc хэт их хэрэглэсэн эсэх
2. `@param`/`@return` tag-ууд
3. Коммент/код харьцаа
4. AI-д түгээмэл хэллэгүүд
5. Мэдэгдэж буй AI коммент загвар
6. Indent загвар
7. Мөрийн уртын жигд байдал
8. Exception throw хэрэглэсэн эсэх
9. Хоосон мөрийн загвар
10. Method нэрийн жигд байдал
11. Ашиглагдаагүй import

## ⚠️ Дүрэм

1. **Тест файлуудыг өөрчлөхгүй** — `tests/` хавтас дахь файлуудыг хөндөхгүй
2. **Зөвхөн `.java` файлуудад код бичнэ** — `assignments/` хавтас дахь starter файлуудад
3. **AI ашиглахгүй** — ChatGPT, Copilot, Claude зэрэг AI хэрэгсэл хэрэглэхгүй
4. **Өөрийн branch дээр ажиллана**
5. **Deadline-аа баримтална**

## 🛠️ Шаардлага

- **Java 17+** (`java -version`)
- **Python 3.11+** (`python3 --version`) — AI detector-д
- **Bash** — тест скриптэд
- **curl** — JUnit jar автомат татахад

## 📞 Асуулт байвал

Багшдаа хандана уу. Амжилт хүсье! 🎓
