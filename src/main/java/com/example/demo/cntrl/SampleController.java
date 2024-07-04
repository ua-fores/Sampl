package com.example.demo.cntrl;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.form.UserForm;

@Controller
public class SampleController {

	@RequestMapping(value = "/", method = GET)
	public String input(UserForm userForm, Model model) {
		model.addAttribute("ageList", getAgeList());
		model.addAttribute("triggerMap", getTriggerCheckbox());
		return "input";
	}

	@RequestMapping(value = "/confirm", method = POST)
	public String confirm(UserForm userForm) {
		return "confirm";
	}

	@RequestMapping(value = "/send", method = POST)
	public String send() {
		return "completion";
	}

	/**
	 * 年齢セレクトボックス用のリストを作成し返す
	 */
	private List<Integer> getAgeList() {
		List<Integer> list = new ArrayList<>();
		for (int i = 18; i < 100; i++) {
			list.add(i);
		}
		return list;
	}

	/**
	 * きっかけチェックボックス用のマップを作成し返す。
	 */
	private Map<Integer, String> getTriggerCheckbox() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "チラシを見て");
		map.put(2, "CM を見て");
		map.put(3, "友人に進められて");
		map.put(4, "ググったら出たから");
		map.put(5, "その他");
		return map;
	}

}