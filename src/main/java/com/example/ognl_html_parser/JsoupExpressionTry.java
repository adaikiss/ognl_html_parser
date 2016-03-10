package com.example.ognl_html_parser;

import org.jsoup.*;
import org.jsoup.nodes.*;

/**
 * @author hlw
 * @date 2016/3/10
 */
public class JsoupExpressionTry {
    public static void main(String []args){
        String html = "<div class=\"result-list\">\n" +
                "                            \t\t\t\t        \t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            \t\t\t\t\t\t\t\t                                                                                        \n" +
                "\n" +
                "    \n" +
                "\n" +
                "                                    \n" +
                "<div class=\"result-item result-game-item\">\n" +
                "            \n" +
                "            <div class=\"result-game-item-pic\">\n" +
                "            <a cpos=\"img\" href=\"http://www.biquge.la/book/14/\" class=\"result-game-item-pic-link\" target=\"_blank\" style=\"width:110px;height:150px;\">\n" +
                "                <img src=\"http://www.biquge.la/files/article/image/0/14/14s.jpg\" alt=\"<em>完美</em><em>世界</em>\" class=\"result-game-item-pic-link-img\"\n" +
                "                    onerror=\"$(this).attr('src', '/static/img/novel-noimg.jpg')\" > \n" +
                "            </a>\n" +
                "        </div>\n" +
                "        <div class=\"result-game-item-detail\">\n" +
                "        <h3 class=\"result-item-title result-game-item-title\">\n" +
                "            <a cpos=\"title\" href=\"http://www.biquge.la/book/14/\" title=\"完美世界\" class=\"result-game-item-title-link\" target=\"_blank\">\n" +
                "                                    <em>完美</em><em>世界</em>\n" +
                "                            </a>\n" +
                "        </h3>\n" +
                "                                                            <p class=\"result-game-item-desc\">一粒尘可填海，一根草斩尽日月星辰，弹指间天翻地覆。\n" +
                "    群雄并起，万族林立，诸圣争霸，乱天动地。问苍茫大地，谁主…</p>\n" +
                "                <div class=\"result-game-item-info\">\n" +
                "                                                                             \n" +
                "                        <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">作者：</span>\n" +
                "                                                            <span>\n" +
                "                                                                            辰东\n" +
                "                                                                    </span>\n" +
                "                                                    </p>\n" +
                "                                                                                                            <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">类型：</span>\n" +
                "                            <span class=\"result-game-item-info-tag-title\">玄幻小说</span>\n" +
                "                        </p>\n" +
                "                                                                                                                 \n" +
                "                        <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">更新时间：</span>\n" +
                "                            <span class=\"result-game-item-info-tag-title\">2016-03-10</span>\n" +
                "                        </p>\n" +
                "                                                                                                            <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">更新状态：</span>\n" +
                "                            <span class=\"result-game-item-info-tag-title\">连载中</span>\n" +
                "                        </p>\n" +
                "                                                        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                " \t\t\t\t\t\t\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \t\t\t\t\t\t\t\t                                                                                        \n" +
                "\n" +
                "    \n" +
                "\n" +
                "                                    \n" +
                "<div class=\"result-item result-game-item\">\n" +
                "            \n" +
                "            <div class=\"result-game-item-pic\">\n" +
                "            <a cpos=\"img\" href=\"http://www.biquge.la/book/3711/\" class=\"result-game-item-pic-link\" target=\"_blank\" style=\"width:110px;height:150px;\">\n" +
                "                <img src=\"http://www.biquge.la/files/article/image/3/3711/3711s.jpg\" alt=\"<em>完美</em>风暴\" class=\"result-game-item-pic-link-img\"\n" +
                "                    onerror=\"$(this).attr('src', '/static/img/novel-noimg.jpg')\" > \n" +
                "            </a>\n" +
                "        </div>\n" +
                "        <div class=\"result-game-item-detail\">\n" +
                "        <h3 class=\"result-item-title result-game-item-title\">\n" +
                "            <a cpos=\"title\" href=\"http://www.biquge.la/book/3711/\" title=\"完美世界\" class=\"result-game-item-title-link\" target=\"_blank\">\n" +
                "                                    <em>完美</em>风暴\n" +
                "                            </a>\n" +
                "        </h3>\n" +
                "                                                            <p class=\"result-game-item-desc\">2019年7月13日，苏凌出狱。\n" +
                "    2019年7月15日，全<em>世界</em>第一款虚拟游戏‘<em>完美</em>风暴’正式开服。\n" +
                "    这是一场革命性的风暴，也是一场划时代的风暴。\n" +
                "    “所有人都知道我叫</p>\n" +
                "                <div class=\"result-game-item-info\">\n" +
                "                                                                             \n" +
                "                        <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">作者：</span>\n" +
                "                                                            <span>\n" +
                "                                                                            云帝\n" +
                "                                                                    </span>\n" +
                "                                                    </p>\n" +
                "                                                                                                            <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">类型：</span>\n" +
                "                            <span class=\"result-game-item-info-tag-title\">网游小说</span>\n" +
                "                        </p>\n" +
                "                                                                                                                 \n" +
                "                        <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">更新时间：</span>\n" +
                "                            <span class=\"result-game-item-info-tag-title\">2015-01-05</span>\n" +
                "                        </p>\n" +
                "                                                                                                            <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">更新状态：</span>\n" +
                "                            <span class=\"result-game-item-info-tag-title\">连载中</span>\n" +
                "                        </p>\n" +
                "                                                        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                " \t\t\t\t\t\t\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            \t\t\t\t\t\t\t\t                                                                                        \n" +
                "\n" +
                "    \n" +
                "\n" +
                "                                    \n" +
                "<div class=\"result-item result-game-item\">\n" +
                "            \n" +
                "            <div class=\"result-game-item-pic\">\n" +
                "            <a cpos=\"img\" href=\"http://www.biquge.la/book/5576/\" class=\"result-game-item-pic-link\" target=\"_blank\" style=\"width:110px;height:150px;\">\n" +
                "                <img src=\"http://www.biquge.la/files/article/image/5/5576/5576s.jpg\" alt=\"<em>完美</em>战神\" class=\"result-game-item-pic-link-img\"\n" +
                "                    onerror=\"$(this).attr('src', '/static/img/novel-noimg.jpg')\" > \n" +
                "            </a>\n" +
                "        </div>\n" +
                "        <div class=\"result-game-item-detail\">\n" +
                "        <h3 class=\"result-item-title result-game-item-title\">\n" +
                "            <a cpos=\"title\" href=\"http://www.biquge.la/book/5576/\" title=\"完美战神\" class=\"result-game-item-title-link\" target=\"_blank\">\n" +
                "                                    <em>完美</em>战神\n" +
                "                            </a>\n" +
                "        </h3>\n" +
                "                                                            <p class=\"result-game-item-desc\">这是最辉煌的黄金时代，又是最悲哀的黑暗时代。如果世人皆称我为上帝弃子，我便取而代之成为无所不能的上帝！——苏寒</p>\n" +
                "                <div class=\"result-game-item-info\">\n" +
                "                                                                             \n" +
                "                        <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">作者：</span>\n" +
                "                                                            <span>\n" +
                "                                                                            辰东\n" +
                "                                                                    </span>\n" +
                "                                                    </p>\n" +
                "                                                                                                            <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">类型：</span>\n" +
                "                            <span class=\"result-game-item-info-tag-title\">科幻小说</span>\n" +
                "                        </p>\n" +
                "                                                                                                                 \n" +
                "                        <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">更新时间：</span>\n" +
                "                            <span class=\"result-game-item-info-tag-title\">2015-06-16</span>\n" +
                "                        </p>\n" +
                "                                                                                                            <p class=\"result-game-item-info-tag\">\n" +
                "                            <span class=\"result-game-item-info-tag-title preBold\">更新状态：</span>\n" +
                "                            <span class=\"result-game-item-info-tag-title\">连载中</span>\n" +
                "                        </p>\n" +
                "                                                        </div>\n" +
                "    </div>\n" +
                "</div></div>";
        Document doc = Jsoup.parse(html);
        //String selector = ".result-list>.result-item:has(.result-item-title>a[title=\" + \"完美世界\" + \"]):has(.result-game-item-info-tag>span:nth-child(2):matches(\\s*\" + \"辰东\" + \"\\s*))";
        String selector = ".result-list>.result-item:has(.result-game-item-info-tag>span:nth-child(2):matches(\\s*" + "辰东" + "\\s*)):has(.result-item-title>a[title=" + "完美世界" + "])";
        System.out.println(doc.select(selector));
    }
}
