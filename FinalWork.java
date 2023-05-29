// 1. Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
// ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
//   Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// 4. Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации
// можно также в Map.
// 5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FinalWork {
	public static void main(String[] args) {
		Shop laptop1 = new Shop("laptop1", "14799", "14", "серебристый", "Full HD", "Intel Celeron N4020", "4 Гб",
				"SSD 128 Гб",
				"Intel UHD Graphics 600", "No");
		Shop laptop2 = new Shop("laptop2", "15999", "14", "серый", "HD", "Intel Celeron 3350", "4 Гб", "eMMc 128 Гб",
				"Intel HD Graphics 500", "No");
		Shop laptop3 = new Shop("laptop3", "22999", "14", "серебристый", "Full HD", "Intel Celeron J4125", "8 Гб",
				"SSD 240 Гб",
				"Intel UHD Graphics 600", "No");
		Shop laptop4 = new Shop("laptop4", "28999", "14", "черный", "HD", "Intel Pentium Silver N5030", "4 Гб",
				"eMMc 128 Гб",
				"Intel UHD Graphics 605", "No");
		Shop laptop5 = new Shop("laptop5", "34999", "14", "черный", "Full HD", "Intel Core i3-1115G4", "8 Гб",
				"HDD 1000 Гб",
				"Intel UHD Graphics", "No");
		Shop laptop6 = new Shop("laptop6", "25999", "15.6", "серый", "HD", "AMD 3020e", "14 Гб", "SSD 256 Гб",
				"AMD Radeon Graphics", "No");
		Shop laptop7 = new Shop("laptop7", "27999", "15.6", "серый", "HD", "AMD Athlon Silver 3050U", "4 Гб",
				"HDD 1000 Гб",
				"AMD Radeon Graphics", "No");
		Shop laptop8 = new Shop("laptop8", "30999", "15.6", "серый", "Full HD", "AMD Ryzen 3 4300U", "8 Гб",
				"SSD 256 Гб",
				"AMD Radeon Graphics", "No");
		Shop laptop9 = new Shop("laptop9", "37499", "15.6", "белый", "Full HD", "AMD Ryzen 5 5500U", "8 Гб",
				"SSD 512 Гб",
				"AMD Radeon Graphics", "No");
		Shop laptop10 = new Shop("laptop10", "43299", "15.6", "белый", "Full HD", "AMD Ryzen 5 5500U", "16 Гб",
				"SSD 512 Гб",
				"AMD Radeon Graphics", "No");
		Shop laptop11 = new Shop("laptop11", "59999", "15.6", "черный", "Full HD", "Intel Core i7-1255U", "16 Гб",
				"SSD 512 Гб",
				"Intel UHD Graphics", "No");
		Shop laptop12 = new Shop("laptop12", "72799", "15.6", "серебристый", "Full HD", "Intel Core i7-10510U", "8 Гб",
				"SSD 1000 Гб",
				"Intel UHD Graphics", "No");
		Shop laptop13 = new Shop("laptop13", "83499", "15.6", "серебристый", "Full HD", "Intel Core i7-1165G7", "16 Гб",
				"SSD 512 Гб",
				"Intel Iris Xe Graphics", "Yes");
		Shop laptop14 = new Shop("laptop14", "29999", "14", "черный", "Full HD", "Intel Core i3-1005G1", "4 Гб",
				"SSD 256 Гб",
				"Intel UHD Graphics", "No");
		Shop laptop15 = new Shop("laptop15", "34999", "15.6", "черный", "Full HD", "Intel Core i3-1215U", "8 Гб",
				"SSD 256 Гб",
				"Intel UHD Graphics", "Yes");
		Shop laptop16 = new Shop("laptop16", "38499", "15.6", "серебристый", "Full HD", "Intel Core i5-10210U", "8 Гб",
				"SSD 256 Гб",
				"Intel UHD Graphics", "Yes");
		Shop laptop17 = new Shop("laptop17", "43499", "14", "серебристый", "Full HD", "Intel Core i5-10210U", "8 Гб",
				"SSD 512 Гб",
				"Intel UHD Graphics", "Yes");
		Shop laptop18 = new Shop("laptop18", "77499", "17.3", "серый", "Full HD", "Intel Core i5-12500H", "16 Гб",
				"SSD 512 Гб",
				"GeForce RTX 3050", "Yes");
		Shop laptop19 = new Shop("laptop19", "16199", "14.1", "серый", "Full HD", "Intel Celeron N4020", "8 Гб",
				"eMMc 128 Гб",
				"Intel UHD Graphics 600", "No");
		Shop laptop20 = new Shop("laptop20", "27999", "15.6", "серый", "Full HD", "Intel Pentium Silver N5030", "4 Гб",
				"HDD 1000 Гб",
				"Intel UHD Graphics 605", "No");
		Shop laptop21 = new Shop("laptop21", "27999", "15.6", "черный", "Full HD", "Intel Pentium Silver N5030", "4 Гб",
				"SSD 128 Гб",
				"Intel UHD Graphics 605", "No");
		Shop laptop22 = new Shop("laptop22", "27999", "14", "черный", "HD", "AMD Athlon Silver 3050U", "4 Гб",
				"SSD 128 Гб",
				"AMD Radeon Graphics", "No");
		Shop laptop23 = new Shop("laptop23", "29999", "15.6", "черный", "Full HD", "AMD Athlon Silver 3050U", "4 Гб",
				"eMMc 128 Гб",
				"AMD Radeon Graphics", "No");
		Shop laptop24 = new Shop("laptop24", "39999", "17.3", "черный", "Full HD", "AMD Ryzen 3 3200U", "8 Гб",
				"SSD 256 Гб",
				"AMD Radeon Vega 3", "Yes");
		Shop laptop25 = new Shop("laptop25", "34999", "14.1", "серебристый", "Full HD", "AMD Ryzen 3 3250U", "16 Гб",
				"SSD 256 Гб",
				"AMD Radeon Graphics", "Yes");
		Shop laptop26 = new Shop("laptop26", "54499", "16.1", "серый", "Full HD", "AMD Ryzen 5 5600U", "16 Гб",
				"SSD 512 Гб",
				"AMD Radeon Graphics", "No");
		Shop laptop27 = new Shop("laptop27", "132999", "16.1", "серебристый", "Full HD", "AMD Ryzen 5 5600U", "8 Гб",
				"SSD 512 Гб",
				"GeForce RTX 3050 Ti", "No");
		Shop laptop28 = new Shop("laptop28", "253999", "14", "черный", "Full HD", "AMD Ryzen 7 PRO 6850U", "16 Гб",
				"SSD 512 Гб",
				"AMD Radeon 680M", "Yes");
		Shop laptop29 = new Shop("laptop29", "231999", "17.3", "серебристый", "Full HD", "AMD Ryzen 7 6800H", "16 Гб",
				"SSD 1024 Гб",
				"GeForce RTX 3060", "Yes");
		Shop laptop30 = new Shop("laptop30", "109999", "15.6", "серый", "Full HD", "AMD Ryzen 7 5800H", "16 Гб",
				"SSD 1000 Гб",
				"Radeon RX 6700M", "Yes");
		Shop laptop31 = new Shop("laptop31", "27999", "15.6", "серый", "Full HD", "AMD 3020e", "4 Гб", "SSD 256 Гб",
				"AMD Radeon Graphics",
				"No");
		Shop laptop32 = new Shop("laptop32", "15999", "14.1", "белый", "Full HD", "Intel Celeron N4020", "4 Гб",
				"eMMc 128 Гб",
				"Intel UHD Graphics 600", "No");
		Shop laptop33 = new Shop("laptop33", "32999", "14", "белый", "Full HD", "Intel Pentium Gold 7505", "4 Гб",
				"SSD 256 Гб",
				"Intel UHD Graphics", "No");
		Shop laptop34 = new Shop("laptop34", "171999", "14.2", "белый", "WQSXGA", "Intel Core i7-1260P", "16 Гб",
				"SSD 1000 Гб",
				"Intel Iris Xe Graphics", "Yes");
		Shop laptop35 = new Shop("laptop35", "56999", "17.3", "серебристый", "Full HD", "Intel Core i3-1215U", "8 Гб",
				"SSD 512 Гб",
				"Intel UHD Graphics", "No");
		Shop laptop36 = new Shop("laptop36", "64999", "17.3", "серый", "Full HD", "Intel Core i5-1235U", "8 Гб",
				"SSD 512 Гб",
				"Intel Iris Xe Graphics", "Yes");
		Shop laptop37 = new Shop("laptop37", "116999", "17.3", "серый", "Full HD", "Intel Core i5-12500H", "16 Гб",
				"SSD 512 Гб",
				"GeForce RTX 3060", "Yes");
		Shop laptop38 = new Shop("laptop38", "154999", "14.2", "серый", "WQSXGA", "Intel Core i7-1260P", "16 Гб",
				"SSD 1000 Гб",
				"Intel Iris Xe Graphics", "No");
		Shop laptop39 = new Shop("laptop39", "167999", "15.6", "черный", "Full HD", "Intel Core i5-12450H", "16 Гб",
				"SSD 512 Гб",
				"GeForce RTX 3060", "No");
		Shop laptop40 = new Shop("laptop40", "167999", "16.2", "серый", "WQSXGA", "Apple M1 Pro", "16 Гб",
				"SSD 1024 Гб",
				"Apple M1 Pro 16-core", "No");

		Set<Shop> laptops = new LinkedHashSet<>();
		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);
		laptops.add(laptop4);
		laptops.add(laptop5);
		laptops.add(laptop6);
		laptops.add(laptop7);
		laptops.add(laptop8);
		laptops.add(laptop9);
		laptops.add(laptop10);
		laptops.add(laptop11);
		laptops.add(laptop12);
		laptops.add(laptop13);
		laptops.add(laptop14);
		laptops.add(laptop15);
		laptops.add(laptop16);
		laptops.add(laptop17);
		laptops.add(laptop18);
		laptops.add(laptop19);
		laptops.add(laptop20);
		laptops.add(laptop21);
		laptops.add(laptop22);
		laptops.add(laptop23);
		laptops.add(laptop24);
		laptops.add(laptop25);
		laptops.add(laptop26);
		laptops.add(laptop27);
		laptops.add(laptop28);
		laptops.add(laptop29);
		laptops.add(laptop30);
		laptops.add(laptop31);
		laptops.add(laptop32);
		laptops.add(laptop33);
		laptops.add(laptop34);
		laptops.add(laptop35);
		laptops.add(laptop36);
		laptops.add(laptop37);
		laptops.add(laptop38);
		laptops.add(laptop39);
		laptops.add(laptop40);

		Set<HashMap> laptopsSet = new HashSet<>();
		for (Shop laptop : laptops) {
			HashMap<String, String> laptopMap = new HashMap<>();
			laptopMap.put("name", laptop.getName());
			laptopMap.put("price", laptop.getPrice());
			laptopMap.put("screenDiagonal", laptop.getScreenDiagonal());
			laptopMap.put("color", laptop.getColor());
			laptopMap.put("screenResolution", laptop.getScreenResolution());
			laptopMap.put("processor", laptop.getProcessor());
			laptopMap.put("ram", laptop.getRam());
			laptopMap.put("drive", laptop.getDrive());
			laptopMap.put("videoСard", laptop.getVideoСard());
			laptopMap.put("keyIllumination", laptop.getKeyIllumination());
			laptopsSet.add(laptopMap);
		}
		// System.out.println(laptopsSet);
		System.out.println();
		Scanner scanner = new Scanner(System.in, "866");
		System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - длина диагонали");
		System.out.println("2 - процессор\n3 - RAM\n4 - тип накопителя\n5 - цвет\n6 - подсветка клавиш");
		int input = inputNumber(scanner);
		System.out.println();

		if (input == 1) {
			System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - 14\"");
			System.out.println("2 - 15\"\n3 - 16\"\n4 - 17\"\n");
			int input1 = inputNumber(scanner);
			System.out.println();

			if (input1 == 1) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.equals("14")) {
							System.out.println("Ноутбук с диагональю 14\":");
							System.out.println(laptopMap);
						}

						if (value.equals("14.1")) {
							System.out.println("Ноутбук с диагональю 14.1\":");
							System.out.println(laptopMap);
						}

						if (value.equals("14.2")) {
							System.out.println("Ноутбук с диагональю 14.2\":");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 2) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.equals("15.6")) {
							System.out.println("Ноутбук с диагональю 15.6\":");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 3) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.equals("16.1")) {
							System.out.println("Ноутбук с диагональю 16.1\":");
							System.out.println(laptopMap);
						}

						if (value.equals("16.2")) {
							System.out.println("Ноутбук с диагональю 16.2\":");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 4) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.equals("17.3")) {
							System.out.println("Ноутбук с диагональю 17.3\":");
							System.out.println(laptopMap);
						}
					}
				}
			}
			if (input1 > 4 || input1 < 1)
				System.out.println("Неверный ввод");
		}

		if (input == 2) {
			System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - Intel Celeron");
			System.out.println("2 - Intel Pentium\n3 - Intel Core i3\n4 - Intel Core i5\n5 - Intel Core i7");
			System.out.println("6 - AMD Athlon\n7 - AMD Ryzen3\n8 - AMD Ryzen5\n9 - AMD Ryzen7");
			int input1 = inputNumber(scanner);
			System.out.println();

			if (input1 == 1) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("Intel Celeron")) {
							System.out.println("Ноутбук с процессором Intel Celeron:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 2) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("Intel Pentium")) {
							System.out.println("Ноутбук с процессором Intel Pentium:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 3) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("Intel Core i3")) {
							System.out.println("Ноутбук с процессором Intel Core i3:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 4) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("Intel Core i5")) {
							System.out.println("Ноутбук с процессором Intel Core i5:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 5) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("Intel Core i7")) {
							System.out.println("Ноутбук с процессором Intel Core i7:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 6) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("AMD Athlon")) {
							System.out.println("Ноутбук с процессором AMD Athlon:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 7) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("AMD Ryzen3")) {
							System.out.println("Ноутбук с процессором AMD Ryzen3:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 8) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("AMD Ryzen5")) {
							System.out.println("Ноутбук с процессором AMD Ryzen5:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 9) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("AMD Ryzen7")) {
							System.out.println("Ноутбук с процессором AMD Ryzen7:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 > 9 || input1 < 1)
				System.out.println("Неверный ввод");
		}

		if (input == 3) {
			System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - 4 Гб");
			System.out.println("2 - 8 Гб\n3 - 16Гб");
			int input1 = inputNumber(scanner);
			System.out.println();

			if (input1 == 1) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("4 Гб")) {
							System.out.println("Ноутбук с RAM 4 Гб:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 2) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("8 Гб")) {
							System.out.println("Ноутбук с RAM 8 Гб:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 3) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("16 Гб")) {
							System.out.println("Ноутбук с RAM 16 Гб:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 > 3 || input1 < 1)
				System.out.println("Неверный ввод");
		}

		if (input == 4) {
			System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - HDD\n2 - SSD\n3 - eMMc");
			int input1 = inputNumber(scanner);
			System.out.println();

			if (input1 == 1) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("HDD")) {
							System.out.println("Ноутбук с HDD:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 2) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("SSD")) {
							System.out.println("Ноутбук с SSD:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 3) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("eMMc")) {
							System.out.println("Ноутбук с eMMc:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 > 3 || input1 < 1)
				System.out.println("Неверный ввод");
		}

		if (input == 5) {
			System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - черный\n2 - серебристый");
			System.out.println("3 - серый\n4 - белый");
			int input1 = inputNumber(scanner);
			System.out.println();

			if (input1 == 1) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("черный")) {
							System.out.println("Ноутбук черный:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 2) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("серебристый")) {
							System.out.println("Ноутбук серебристый:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 3) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("серый")) {
							System.out.println("Ноутбук серый:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 4) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("белый")) {
							System.out.println("Ноутбук белый:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 > 4 || input1 < 1)
				System.out.println("Неверный ввод");
		}

		if (input == 6) {
			System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - да\n2 - нет");
			int input1 = inputNumber(scanner);
			System.out.println();

			if (input1 == 1) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("Yes")) {
							System.out.println("Ноутбук с подсветкой клавиш:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 == 2) {
				for (var laptopMap : laptopsSet) {
					Iterator iterator = laptopMap.keySet().iterator();
					while (iterator.hasNext()) {
						Object key = iterator.next();
						Object value = laptopMap.get(key);

						if (value.toString().contains("No")) {
							System.out.println("Ноутбук без подсветки клавиш:");
							System.out.println(laptopMap);
						}
					}
				}
			}

			if (input1 > 2 || input1 < 1)
				System.out.println("Неверный ввод");
		}

		if (input > 6 || input < 1)
				System.out.println("Неверный ввод");
	}

	private static int inputNumber(Scanner scanner) {
		while (true) {
			try {
				String line = scanner.nextLine();
				if (line.equals("3")) {
					System.out.println("Пустой ввод");
				}
				if (line.equals(" ")) {
					System.out.println("Введите одно число");
				}
				return Integer.parseInt(line);
			} catch (Exception ex) {
				System.out.printf("Ошибка ввода: %s\n", ex.getMessage());
			}
		}
	}

}
