<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>메인타이틀</title>
<script type="text/javascript">
	function shuffle() {
		var ran = 0;
		var recipes = new Array();
		var recipes_lvl = new Array();
		var recipes_type = new Array();
		
		var lvl = document.getElementById("level").value;
		var type = document.getElementById("type").value;
		var stop_l = false;
		var stop_d = false;

		<c:forEach var="vo" items="${list}" varStatus="status">
			recipes.push("${vo.RECIPE_NM_KO}");
			recipes_lvl.push("${vo.LEVEL_NM}");
			recipes_type.push("${vo.NATION_NM}");
		</c:forEach>

		var i = 0;
		var j = 0;
		while (!stop_l) {
			ran = Math.floor(Math.random() * (536 - 0) + 0);
			if (lvl == recipes_lvl[ran] && lvl == "초보환영") {
				document.getElementById("lunch" + (i + 1) + "").innerText = recipes[ran]
						+ " " + recipes_lvl[ran] + "  나라:" + recipes_type[ran];
				i++;
			} else if (lvl == "보통" && "보통" == recipes_lvl[ran]) {
				document.getElementById("lunch" + (i + 1) + "").innerText = recipes[ran]
						+ " " + recipes_lvl[ran] + "  나라:" + recipes_type[ran];
				i++;
			} else if (lvl == "보통까지") {
				if ("보통" == recipes_lvl[ran] || "초보환영" == recipes_lvl[ran]) {
					document.getElementById("lunch" + (i + 1) + "").innerText = recipes[ran]
							+ " " + recipes_lvl[ran] + "  나라:" + recipes_type[ran];
					i++;
				}
			} else if (lvl == "어려움" && "어려움" == recipes_lvl[ran]) {
				document.getElementById("lunch" + (i + 1) + "").innerText = recipes[ran]
						+ " " + recipes_lvl[ran] + "  나라:" + recipes_type[ran];
				i++;
			}

			if (lvl == "상관없음") {
				document.getElementById("lunch" + (i + 1) + "").innerText = recipes[ran]
						+ " " + recipes_lvl[ran] + "  나라:" + recipes_type[ran];
				i++;
			}

			if (i == 7) {
				stop_l = true;
			}
		}

		while (!stop_d) {
			ran = Math.floor(Math.random() * (536 - 0) + 0);
			if (lvl == recipes_lvl[ran] && lvl == "초보환영") {
				document.getElementById("dinner" + (j + 1) + "").innerText = recipes[ran]
						+ " " + recipes_lvl[ran] + "  나라:" + recipes_type[ran];
				j++;
			} else if (lvl == "보통까지") {
				if ("보통" == recipes_lvl[ran] || "초보환영" == recipes_lvl[ran]) {
					document.getElementById("dinner" + (j + 1) + "").innerText = recipes[ran]
							+ " " + recipes_lvl[ran] + "  나라:" + recipes_type[ran];
					j++;
				}
			} else if (lvl == "보통" && "보통" == recipes_lvl[ran]) {
				document.getElementById("dinner" + (j + 1) + "").innerText = recipes[ran]
						+ " " + recipes_lvl[ran] + "  나라:" + recipes_type[ran];
				j++;
			} else if (lvl == "어려움" && "어려움" == recipes_lvl[ran]) {
				document.getElementById("dinner" + (j + 1) + "").innerText = recipes[ran]
						+ " " + recipes_lvl[ran] + "  나라:" + recipes_type[ran];
				j++;
			}

			if (lvl == "상관없음") {
				document.getElementById("dinner" + (j + 1) + "").innerText = recipes[ran]
						+ " " + recipes_lvl[ran] + "  나라:" + recipes_type[ran];
				j++;
			}

			if (j == 7) {
				stop_d = true;
			}
		}
	}
	function addItem() {

	}
</script>

</head>
<body>
	<table border="1" width="900px" height="300px" align="center">
		<tr>
			<th></th>
			<th>월</th>
			<th>화</th>
			<th>수</th>
			<th>목</th>
			<th>금</th>
			<th>토</th>
			<th>일</th>
		</tr>
		<tr>
			<td>점심</td>
			<td><a id="lunch1"></a></td>
			<td><a id="lunch2"></a></td>
			<td><a id="lunch3"></a></td>
			<td><a id="lunch4"></a></td>
			<td><a id="lunch5"></a></td>
			<td><a id="lunch6"></a></td>
			<td><a id="lunch7"></a></td>
		</tr>
		<tr>
			<td>저녁</td>
			<td><a id="dinner1"></a></td>
			<td><a id="dinner2"></a></td>
			<td><a id="dinner3"></a></td>
			<td><a id="dinner4"></a></td>
			<td><a id="dinner5"></a></td>
			<td><a id="dinner6"></a></td>
			<td><a id="dinner7"></a></td>
		</tr>
	</table>
	<a> 보유 재료 : <input type="text" id="hasItem1" /> <input
		type="button" id="add_hasItem" value="+추가" /> <input type="button"
		id="lock_hasItem" value="등록완료" />
	</a>
	<br>
	<a>필요 재료 : </a>
	<br>
	<div>
		난이도 :
		<select id="level">
			<option value="상관없음">상관없음</option>
			<option value="초보환영">초보환영</option>
			<option value="보통">보통만</option>
			<option value="보통까지">보통까지</option>
			<option value="어려움">어려움만</option>
		</select>
		<input type="button" id="shuffle" value="랜덤선택" onclick="shuffle()" /><br>
	</div>
	<hr>
	<div>
		나라별 음식종류 :
		<select id="type">
			<option value="상관없음">상관없음</option>
			<option value="한식">한식</option>
			<option value="서양">서양식</option>
			<option value="일본">일본식</option>
			<option value="퓨전">퓨전</option>
			<option value="중국">중국식</option>
			<option value="동남아시아">동남아시아</option>
			<option value="이탈리아">이탈리아</option>
		</select>
		<input type="button" id="shuffle" value="검색" onclick="search()" />
		<table border="1">
			<c:forEach var="data" items="${list}" varStatus="status">
				<tr>
					<td>${status.index}</td>
					<td>${data.RECIPE_NM_KO}</td>
					<td>${data.LEVEL_NM}</td>
					<td>${data.NATION_NM}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>