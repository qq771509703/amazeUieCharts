package com.example.xxf.Util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * 时间转换工具类。
 */
public class DatetimeUtil {

	/**
	 * 日期格式为yyyyMMdd
	 */
	public static final String DATE_FORMAT = "yyyyMMdd";
	/**
	 * 日期格式为yyyy-MM-dd
	 */
	public static final String DATE_FORMAT2 = "yyyy-MM-dd";
	/**
	 * 日期格式为yyyyMMddHHmm
	 */
	public static final String DATETIME_FORMAT = "yyyyMMddHHmm";
	/**
	 * 时间格式为HHmmss
	 */
	public static final String TIME_FORMAT = "HHmmss";
	/**
	 * 时间格式为HH:mm:ss
	 */
	public static final String TIME_FORMAT2 = "HH:mm:ss";
	/**
	 * 日期格式为yyyyMMddHHmmss
	 */
	public static final String FULL_TIME_FORMAT = "yyyyMMddHHmmss";
	
	/**
	 * 日期格式为yyyy-MM-dd HH:mm:ss
	 */
	public static final String FORMAT_FULL_TIME = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 日期格式为yyyy-MM-dd HH:mm
	 */
	public static final String FORMAT_FULL_TIME_MIN = "yyyy-MM-dd HH:mm";
	/**
	 * 日期格式为yyyyMMddHHmm
	 */
	public static final String FULL_TIME_FORMAT_MIN = "yyyyMMddHHmm";
	/**
	 * 日期格式为yyyyMM
	 */
	public static final String YEAR_MON = "yyyyMM";
	/**
	 * 小时：分
	 */
	public static final String HOUR_MIN = "HH:mm";
	public static final String MONTH_DAY = "MMdd";
	public static final String YEAR = "yyyy";
	/**
	 * 日期格式：yyyy-MM-dd-HH.mm.ss
	 */
	public static final String DATE_TIME = "yyyy-MM-dd-HH.mm.ss";
	private static int weeks = 0;

	/**
	 * 日期对象转换成时间戳（以分钟为单位）
	 * 
	 * @param datetime
	 * @return 以分钟为单位的时间戳 实现： 1.new一个QSDatetime 2.将mDe转换为int型，存入QSDatetime中
	 */
	public static int toInt(Date datetime) {
		// 转为以分钟为单位
		try {
			int mD = (int) (datetime.getTime() / 60000);
			return mD;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * 把时间对象转换成字符串
	 * 
	 * @param date
	 *            -日期 format-格式
	 * @return 格式为2010-12-09 10:02:00 实现： 1.将date值扩展成long mLd 2.通过mLd生成日期型数据mDd
	 *         3.new一个Calendar类型的对象mCa 4.通过mCa生成返回字符串
	 */
	public static String parseToString(Date date, String format) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		Date formatDate = cal.getTime();
		SimpleDateFormat sf = new SimpleDateFormat(format);
		return sf.format(formatDate);
	}

	/**
	 * 解析时间戳转换为日期时间值
	 * 
	 * @param str
	 *            时间戳 format
	 * @return 将时间戳转换为时间值
	 */
	public static String parseToString(long str, String format) {
		SimpleDateFormat sf = new SimpleDateFormat(format);
		return sf.format(str);
	}

	/**
	 * 获取上个月的第一天和最后一天的日期
	 * 
	 * @return 字符串数组，是由获取到的第一天的日期和最后一天的日期组成。 例：[20150401,20150430] 1.取得当前系统时间
	 *         2.设置当前时间为本月的第一天 3.把当前时间减去一天，获取到上个月的最后一天的时间 4.获取到当前的年、月进行时间的拼装
	 */
	public static String[] getFirstDayAndFinalDayOfLastMonth() {
		// 取得系统当前时间
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		// 取得系统当前时间所在月第一天时间对象
		cal.set(Calendar.DAY_OF_MONTH, 1);
		// 日期减一,取得上月最后一天时间对象
		cal.add(Calendar.DAY_OF_MONTH, -1);
		// 输出上月最后一天日期
		int day = cal.get(Calendar.DAY_OF_MONTH);
		String months = "";
		String days = "";
		if (month > 1) {
			month--;
		} else {
			year--;
			month = 12;
		}
		if (!(String.valueOf(month).length() > 1)) {
			months = "0" + month;
		} else {
			months = String.valueOf(month);
		}
		if (!(String.valueOf(day).length() > 1)) {
			days = "0" + day;
		} else {
			days = String.valueOf(day);
		}
		String firstDay = year + months + "01";
		String lastDay = year + months + days;
		String[] lastMonth = new String[2];
		lastMonth[0] = firstDay;
		lastMonth[1] = lastDay;
		return lastMonth;
	}

	/**
	 * 获取本月的第一天和最后一天的日期
	 * 
	 * @return 字符串数组，是由获取到的第一天的日期和最后一天的日期组成。 例：[20150507000000,20150531235959]
	 *         [20150507,20150531] [2015-05-07,2015-05-31]
	 */
	public static String[] getFirstDayAndFinalDayOfThisMonth(String format) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, 1);
		cal.roll(Calendar.DATE, -1);
		Date lastDay = cal.getTime();
		cal.set(GregorianCalendar.DAY_OF_MONTH, 1);
		Date firstDay = cal.getTime();
		SimpleDateFormat sf = new SimpleDateFormat(format);
		String[] currentMonth = new String[2];
		currentMonth[0] = sf.format(firstDay);
		currentMonth[1] = sf.format(lastDay);
		return currentMonth;
	}

	/**
	 * 获取某某年某某月的第一天和最后一天日期
	 * 
	 * @param year
	 *            年份 例：1997
	 * @param month
	 *            月份 例：5或者10
	 * @return 字符串数组，是由获取到的第一天的日期和最后一天的日期组成。 例：[19970201000000,19970228235959]
	 *         [19970201,19970228] [1997-02-01,1997-02-28]
	 */
	public static String[] getFirstDayAndLastDayOfYearAndMonth(int year,
			int month, String format) {
		Calendar time = Calendar.getInstance();
		time.clear();
		time.set(Calendar.YEAR, year); // year 为 int
		time.set(Calendar.MONTH, month - 1);// 注意,Calendar对象默认一月为0

		time.set(Calendar.DATE, 1);
		time.roll(Calendar.DATE, -1);
		Date lastDay = time.getTime();
		time.set(GregorianCalendar.DAY_OF_MONTH, 1);
		Date firstDay = time.getTime();
		String[] s = new String[2];
		SimpleDateFormat sf = new SimpleDateFormat(format);
		s[0] = sf.format(firstDay);
		s[1] = sf.format(lastDay);
		return s;
	}

	/**
	 * 获取上周的第一天和最后一天的日期
	 * 
	 * @return 字符串数组，是由获取到的第一天的日期和最后一天的日期组成。 例：[20150427000000,20150503235959]
	 *         [20150427,20150503] [2015-04-27,2015-05-03]
	 */
	public static String[] getFirstDayAndLastDayOfLastWeek(String format) {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DATE, -7);
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		Date firstDay = (Date) cal.getTime().clone();
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		Date lastDay = (Date) cal.getTime().clone();
		SimpleDateFormat sf = new SimpleDateFormat(format);
		String[] lastWeek = new String[2];
		lastWeek[0] = sf.format(firstDay);
		lastWeek[1] = sf.format(lastDay);
		return lastWeek;
	}

	/**
	 * 获取本周的第一天和最后一天的时间
	 * 
	 * @param format
	 *            返回的时间格式
	 * @return 字符串数组，是由获取到的第一天的时间和最后一天的时间组成。 例 ：[20150504000000,20150510235959]
	 *         [2015-05-04,2015-05-10] [20150504，20150510]
	 */
	public static String[] getFirstDayAndLastDayOfThisWeek(String format) {
		Calendar cal = new GregorianCalendar();
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		Date firstDay = (Date) cal.getTime().clone();
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		Date lastDay = (Date) cal.getTime().clone();
		SimpleDateFormat sf = new SimpleDateFormat(format);
		String[] currentWeek = new String[2];
		String f1 = sf.format(firstDay);
		String f2 = sf.format(lastDay);
		currentWeek[0] = f1;
		currentWeek[1] = f2;
		return currentWeek;
	}

	/**
	 * 获取本月的第一天和最后一天的日期
	 * 
	 * @param format
	 *            返回的日期格式
	 * @return 字符串数组，是由获取到的第一天的日期和最后一天的日期组成。 例 ：[20150501000000,20150531235959]
	 *         [2015-05-01,2015-05-31] [20150501，20150531]
	 */
	public static String[] getFirstDayAndLastDayOfThisMonth(String format) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, 1);
		cal.roll(Calendar.DATE, -1);
		Date lastDay = cal.getTime();
		cal.set(GregorianCalendar.DAY_OF_MONTH, 1);
		Date firstDay = cal.getTime();
		SimpleDateFormat sf = new SimpleDateFormat(format);
		String[] currentMonth = new String[2];
		currentMonth[0] = sf.format(firstDay);
		currentMonth[1] = sf.format(lastDay);
		return currentMonth;
	}

	/**
	 * 获取本季度的第一天和最后一天的日期
	 * 
	 * @return 字符串数组，是由获取到的第一天的日期和最后一天的日期组成。 例 ：[20150401,20150630]
	 */
	public static String[] getFirstDayAndLastDayOfQuarter() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;// 月
		int year = cal.get(Calendar.YEAR);// 年
		String[] currentQuarter = new String[2];
		if (month == 1 || month == 2 || month == 3) {
			currentQuarter[0] = year + "0101";
			currentQuarter[1] = year + "0331";
		} else if (month == 4 || month == 5 || month == 6) {
			currentQuarter[0] = year + "0401";
			currentQuarter[1] = year + "0630";
		} else if (month == 7 || month == 8 || month == 9) {
			currentQuarter[0] = year + "0701";
			currentQuarter[1] = year + "0930";
		} else if (month == 10 || month == 11 || month == 12) {
			currentQuarter[0] = year + "1001";
			currentQuarter[1] = year + "1231";
		}
		return currentQuarter;
	}

	/**
	 * 获取当天的日期
	 * 
	 * @param format
	 *            返回的日期格式
	 * @return 字符串数组，是由获取到的第一个的日期和后一个日期组成,是由传入的日期格式决定。 例
	 *         ：[20150507000000,20150507235959] [20150507,20150507]
	 *         [2015-05-07,2015-05-07]
	 */
	public static String[] getCurrentDay(String format) {
		SimpleDateFormat sf = new SimpleDateFormat(format);
		String[] currentDay = new String[2];
		currentDay[0] = sf.format(new Date());
		currentDay[1] = sf.format(new Date());
		return currentDay;
	}

	/**
	 * 获取昨天的日期
	 * 
	 * @param format
	 *            日期格式
	 * @return 返回昨天的日期
	 */
	public static String getYesterday(String format) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1); // 得到前一天
		String yestedayDate = new SimpleDateFormat(format).format(calendar
				.getTime());
		return yestedayDate;
	}
	
	/**
	 * 获取前几天的日期
	 * 
	 * @param x
	 *            前多少天
	 * @param format
	 *            日期格式
	 * @return 返回前X天的日期
	 */
	public static String getFewDaysAgo(int x, String format) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -x); // 得到前x天
		String yestedayDate = new SimpleDateFormat(format).format(calendar
				.getTime());
		return yestedayDate;
	}
	
	/**
	 * 获取后几天的日期
	 * 
	 * @param x  后多少天
	 * @param format
	 *            日期格式
	 * @return 返回后X天的日期
	 */
	public static String getFewDaysAfter(int x, String format) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, x); // 得到前x天
		String yestedayDate = new SimpleDateFormat(format).format(calendar
				.getTime());
		return yestedayDate;
	}

	/**
	 * 计算2个日期格式相同的日期相差几天（startTime是日期在前的，endTime是日期在后的。endTime-startTime）
	 * 
	 * @param startTime
	 *            较早的日期
	 * @param endTime
	 *            较晚的日期
	 * @param format
	 *            日期格式
	 * @return 返回相差的天数
	 */
	public static long dateDiff(String startTime, String endTime, String format) {
		if (startTime == null || endTime == null || "".equals(startTime)
				|| "".equals(endTime)) {
			return -1;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar cal1 = Calendar.getInstance();
		try {
			cal1.setTime(sdf.parse(startTime));
			Calendar cal2 = Calendar.getInstance();
			cal2.setTime(sdf.parse(endTime));
			long l = cal2.getTimeInMillis() - cal1.getTimeInMillis();
			int days = new Long(l / (1000 * 60 * 60 * 24)).intValue();
			return Math.abs(days);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * 获取本年某个月的第一天和最后一天的日期
	 * 
	 * @param month
	 *            某个月份
	 * @param format
	 *            日期格式
	 * @return 返回一个字符串数组，是由第一天和最后一天2个日期组成 例：[20150301000000，20150331235959]
	 *         [20150301,20150331] [2015-03-01,2015-03-31]
	 */
	public static String[] getFirstDayAndLastDayOfMonthThisYear(int month,
			String format) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, 1);
		cal.roll(Calendar.DATE, -1);
		Date lastDay = cal.getTime();
		cal.set(GregorianCalendar.DAY_OF_MONTH, 1);
		Date firstDay = cal.getTime();
		SimpleDateFormat sf = new SimpleDateFormat(format);
		String[] currentMonth = new String[2];
		currentMonth[0] = sf.format(firstDay);
		currentMonth[1] = sf.format(lastDay);
		return currentMonth;
	}
	
	/**
	 * 获取前后几个月的第一天和最后一天
	 * 
	 * @param month
	 *            往前或者往后几个月份
	 * @param format
	 *            日期格式
	 * @return 返回一个字符串数组，是由第一天和最后一天2个日期组成 例：[20150301000000，20150331235959]
	 *         [20150301,20150331] [2015-03-01,2015-03-31]
	 */
	public static String[] getFirstDayAndLastDayOf(Date date,int month,
			String format) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, month);
		cal.set(Calendar.DATE, 1);
		cal.roll(Calendar.DATE, -1);
		Date lastDay = cal.getTime();
		cal.set(GregorianCalendar.DAY_OF_MONTH, 1);
		Date firstDay = cal.getTime();
		SimpleDateFormat sf = new SimpleDateFormat(format);
		String[] currentMonth = new String[2];
		currentMonth[0] = sf.format(firstDay);
		currentMonth[1] = sf.format(lastDay);
		return currentMonth;
	}

	/**
	 * 获取下一分钟的时间
	 * 
	 * @return 返回下一分钟的时间 例：[20150508103925]
	 */
	public static String getNextMinuteTime() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 1);
		Date currentDay = cal.getTime();
		SimpleDateFormat sf = new SimpleDateFormat(
				DatetimeUtil.FULL_TIME_FORMAT);
		return sf.format(currentDay);
	}

	/**
	 * 获取指定日期的前一天日期
	 * 
	 * @param date
	 *            20150508
	 * @param format
	 *            日期格式
	 * @return 返回指定日期前一天的日期 例：[20150507] [2015-05-07]
	 *         注意：传入的指定日期格式必须和format格式相同，否则获取到的日期有错。
	 */
	public static String getLastDayOfSpecifyDay(String date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date d = sdf.parse(date);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			c.add(Calendar.DATE, -1);
			String _time = sdf.format(c.getTime());
			return _time;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	/**
	 * 获取制定日期的下一天日期
	 * 
	 * @param date
	 * @param format
	 *            日期格式
	 * @return
	 */
	public static String getNextDayOfSpecifyDay(String date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date d = sdf.parse(date);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			c.add(Calendar.DATE, 1);
			String _time = sdf.format(c.getTime());
			return _time;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 把字符串类型的日期转成时间对象
	 * 
	 * @param dateStr
	 *            日期20150508
	 * @param format
	 *            日期格式
	 * @return 返回一个date对象
	 */
	public static Date stringToDate(String dateStr, String format) {
		DateFormat dd = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = dd.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 获取X年后今天的日期
	 * 
	 * @param x
	 *            年数 如果 x为负数的话，则表示前x年的日期
	 * @param format
	 *            日期格式
	 * @return 返回X年后的日期 例 : [20180508] [2018-05-08]
	 */
	public static String getDateInTheFutureOfYear(int x, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date date = new Date();
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.YEAR, +x);
			String _time = sdf.format(c.getTime());
			return _time;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取X月后的日期
	 * 
	 * @param x
	 *            月数 如果 x为负数的话，则表示前x月的日期
	 * @param format
	 *            日期格式
	 * @return 返回X月后的日期 例 : [20150808] [2015-08-08]
	 */
	public static String getDateInTheFutureOfMonth(int x, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date date = new Date();
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.MONTH, +x);
			String _time = sdf.format(c.getTime());
			return _time;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取当前日期的的一个整形数组，里面包括了年、月、日
	 * 
	 * @return 返回一个由年、月、日组成的整形数组
	 */
	public static int[] getCurrentYearAndMonthAndDay() {
		Calendar cal = Calendar.getInstance();// 使用日历类
		int year = cal.get(Calendar.YEAR);// 得到年
		int month = cal.get(Calendar.MONTH) + 1;// 得到月，因为从0开始的，所以要加1
		int day = cal.get(Calendar.DAY_OF_MONTH);// 得到天
		int[] s = new int[3];
		s[0] = year;
		s[1] = month;
		s[2] = day;
		return s;
	}

	/**
	 * 根据一个指定的时间获取年、月、日组成的整形数组
	 * 
	 * @param date
	 *            指定的时间对象
	 * @return 返回一个由年、月、日组成的整形数组
	 */
	public static int[] getYearMonthDay(Date date) {
		Calendar cal = Calendar.getInstance();// 使用日历类
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);// 得到年
		int month = cal.get(Calendar.MONTH) + 1;// 得到月，因为从0开始的，所以要加1
		int day = cal.get(Calendar.DAY_OF_MONTH);// 得到天
		int[] s = new int[3];
		s[0] = year;
		s[1] = month;
		s[2] = day;
		return s;
	}

	/**
	 * 获取2个时间相处的秒数
	 * 
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @param format
	 *            格式
	 * @return
	 */
	public static int getDiffSec(String startTime, String endTime, String format) {
		if (startTime == null || endTime == null || "".equals(startTime)
				|| "".equals(endTime)) {
			return -1;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar cal1 = Calendar.getInstance();
		try {
			cal1.setTime(sdf.parse(startTime));
			Calendar cal2 = Calendar.getInstance();
			cal2.setTime(sdf.parse(endTime));
			long l = cal2.getTimeInMillis() - cal1.getTimeInMillis();
			int second = new Long(l / 1000).intValue();
			return Math.abs(second);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return -1;
		}

	}

	/**
	 * 获取上一个星期一
	 * @return
	 */
	public static String getPreviousWeekday() {
		weeks -= 1;
		int mondayPlus = getMondayPlus();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.add(5, mondayPlus + 7 * weeks);
		Date monday = currentDate.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String preMonday = sdf.format(monday);
		return preMonday;
	}

	/**
	 * 获取上一个星期天
	 * @return
	 */
	public static String getPreviousWeekSunday() {
		weeks = 0;
		weeks -= 1;
		int mondayPlus = getMondayPlus();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.add(5, mondayPlus + weeks);
		Date monday = currentDate.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String preMonday = sdf.format(monday);
		return preMonday;
	}

	private static int getMondayPlus() {
		Calendar cd = Calendar.getInstance();
		int dayOfWeek = cd.get(7) - 1;
		if (dayOfWeek == 1) {
			return 0;
		}
		return (1 - dayOfWeek);
	}
	
	/**
	 * 获取之前或者之后几分钟的时间
	 * @param x(可正可负)正数代表几分钟之后  负数代表几分钟之前
	 * @return
	 */
	public static Date getNextMinute(Date date,int x) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE,x);
		Date currentDay = cal.getTime();
		return currentDay;
	}
	
	/**
	 * 获取星期几
	 * @param date 时间
	 * @return
	 */
	public static int getWeekOfDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return w;
    }
	
	/**
	 * 获取当天日期在一年的的几周
	 * @param date 时间
	 * @return
	 */
	public static int getWeekOfYear(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.WEEK_OF_YEAR);
        if (w < 0)
            w = 0;
        return w;
    }
	
	/**
	 * 判断两个日期相差几个月
	 * @param date1
	 * @param date2
	 * @return
	 * @throws ParseException
	 */
	public static int getMonthSpace(String date1, String date2,String dateFormat){
		try {
			int n = 0;
	        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	        Calendar c1 = Calendar.getInstance();
	        Calendar c2 = Calendar.getInstance();
	        c1.setTime(sdf.parse(date1));
	        c2.setTime(sdf.parse(date2));
	        while (!c1.after(c2)) {// 循环对比，直到相等，n 就是所要的结果 
	            n++;  
	            c1.add(Calendar.MONTH, 1);// 比较月份，月份+1  
	        }  
	        return n;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
    }
	/**
	 * 获取日期的年月日
	 * @param date
	 * @return
	 */
	public static String[] getYearMonDayByDateStr(Date date){
		String str = parseToString(date,DatetimeUtil.DATE_FORMAT);
		String year = str.substring(0,4);
		String month = str.substring(4,6);
		String day = str.substring(6,8);
		String[] strs = new String[3];
		strs[0] = year;
		strs[1] = month;
		strs[2] = day;
		return strs;
	}
	
	/**
	 * 判断一个日期是星期几
	 * @param dateStr
	 * @return
	 */
	public static int dayForWeek(String dateStr){
		SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(format.parse(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int dayForWeek = 0;
		if(c.get(Calendar.DAY_OF_WEEK) == 1){
			dayForWeek = 7;
		}else{
		   dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
		}
		return dayForWeek;
    }
	/**
	 * 获取上个小时的时间（yyyyMMddHH）
	 * @return
	 */
	public static String getLastHourDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHH");
		return df.format(calendar.getTime());
	}
	/**
	 * 获取上个小时的时间（yyyyMMddHH）
	 * @return
	 */
	public static String getLastHour() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 1);
		SimpleDateFormat df = new SimpleDateFormat("HH");
		return df.format(calendar.getTime());
	}
	/**
	 * 获取指定日期上个月的第一天和最后一天
	 * @param date
	 * @return
	 */
	public static String[] getLastMonthOneLastDay(Date date){
		// 取得系统当前时间
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		// 取得系统当前时间所在月第一天时间对象
		cal.set(Calendar.DAY_OF_MONTH, 1);
		// 日期减一,取得上月最后一天时间对象
		cal.add(Calendar.DAY_OF_MONTH, -1);
		// 输出上月最后一天日期
		int day = cal.get(Calendar.DAY_OF_MONTH);
		String months = "";
		String days = "";
		if (month > 1) {
			month--;
		} else {
			year--;
			month = 12;
		}
		if (!(String.valueOf(month).length() > 1)) {
			months = "0" + month;
		} else {
			months = String.valueOf(month);
		}
		if (!(String.valueOf(day).length() > 1)) {
			days = "0" + day;
		} else {
			days = String.valueOf(day);
		}
		String firstDay = year + months + "01";
		String lastDay = year + months + days;
		String[] lastMonth = new String[2];
		lastMonth[0] = firstDay;
		lastMonth[1] = lastDay;
		return lastMonth;
	}
	
	
	/**
	 * 获取指定日期上个月的月份
	 * @param date
	 * @return
	 */
	public static String[] getLastYearAndMonth(Date date){
		// 取得系统当前时间
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		// 取得系统当前时间所在月第一天时间对象
		cal.set(Calendar.DAY_OF_MONTH, 1);
		// 日期减一,取得上月最后一天时间对象
		cal.add(Calendar.DAY_OF_MONTH, -1);
		String months = "";
		if (month > 1) {
			month--;
		} else {
			year--;
			month = 12;
		}
		if (!(String.valueOf(month).length() > 1)) {
			months = "0" + month;
		} else {
			months = String.valueOf(month);
		}
		String []s = new String[2];
		s[0] = year+"";
		s[1] = months;
		return s;
	}
//	public static void main(String[] args) {
//		String[] s = getLastYearAndMonth(new Date());
//		System.out.println(s[0]+"|"+s[1]);
//	}
}